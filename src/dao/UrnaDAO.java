package dao;

import eleicoes.recursos.*;
import java.sql.*;
import java.util.*;

public class UrnaDAO implements GenericDAO<Urna> {

    @Override
    public int insert(Urna emp) {
        int chavePrimaria = -1;
        int idLocalizacao = new LocalizacaoDAO().insert(emp.getLocalizacao());
        if (idLocalizacao == -1) {
            return -1;
        }
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt = connection.prepareStatement(SQLs.INSERT_URNA.getSql(), Statement.RETURN_GENERATED_KEYS)) {
            System.out.println("Conexão aberta!");
            stmt.setInt(1, emp.getZona());
            stmt.setInt(2, emp.getSecao());
            stmt.setString(3, emp.getSituacao().toString());
            stmt.setInt(4, idLocalizacao);
            stmt.execute();
            System.out.println("Dados Gravados!");
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                chavePrimaria = chaves.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("exceção com recursos - urna");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada!");
        }
        return chavePrimaria;

    }

    @Override
    public List<Urna> listAll() {
        List<Urna> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.LISTALL_URNA.getSql())) {
            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int zona = rs.getInt("zona");
                int secao = rs.getInt("secao");
                Situacao situacao = Situacao.getSituacao(rs.getString("situacao"));
                Localizacao loc = new LocalizacaoDAO().findByID(rs.getInt("idlocalizacao"));
                lista.add(new Urna(zona, secao, situacao, loc));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Exceção SQL");
        } catch (Exception e) {
            System.out.println("Exceção no código!");
        }
        return null;
    }

    @Override
    public int update(Urna obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int deleteBy(Urna u) {
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.DELETE_URNA.getSql())) {
            stmt.setInt(1, u.getZona());
            stmt.setInt(2, u.getSecao());
            System.out.println("ConexÃ£o aberta!");
            if (stmt.execute()) {
                return 1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exceção SQL - delete");
        } catch (Exception e) {
            System.out.println("Exceção no código! - delete");
        }
        return -1;
    }

    public List<Urna> findBySit(String sit) {
        List<Urna> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.FINDBYSIT_URNA.getSql())) {
            stmt.setObject(1, sit);
            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int zona = rs.getInt("zona");
                int secao = rs.getInt("secao");
                Situacao situacao = Situacao.getSituacao(rs.getString("situacao"));
                Localizacao loc = new LocalizacaoDAO().findByID(rs.getInt("idlocalizacao"));
                lista.add(new Urna(zona, secao, situacao, loc));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Exceção SQL");
        } catch (Exception e) {
            System.out.println("Exceção no código!");
        }
        return null;
    }

    public List<Urna> findByLoc(String cidade, String uf) {
        List<Urna> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.FINDBYLOC_URNA.getSql())) {
            stmt.setObject(1, cidade);
            stmt.setObject(2, uf);
            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int zona = rs.getInt("zona");
                int secao = rs.getInt("secao");
                Situacao situacao = Situacao.getSituacao(rs.getString("situacao"));
                Localizacao loc = new LocalizacaoDAO().findByID(rs.getInt("idlocalizacao"));
                lista.add(new Urna(zona, secao, situacao, loc));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("Exceção SQL");
        } catch (Exception e) {
            System.out.println("Exceção no código!");
        }
        return null;
    }

    @Override
    public Urna findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(Urna obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
