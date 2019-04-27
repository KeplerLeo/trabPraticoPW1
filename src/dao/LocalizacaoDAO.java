package dao;

import eleicoes.recursos.*;
import java.sql.*;
import java.util.*;

public class LocalizacaoDAO implements GenericDAO<Localizacao> {

    @Override
    public int insert(Localizacao c) {
        int chavePrimaria = -1;
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.INSERT_LOCALIZACAO.getSql(),
                        Statement.RETURN_GENERATED_KEYS)) {
            System.out.println("Conexão aberta!");
            stmt.setString(1, c.getCidade());
            stmt.setString(2, c.getUf());
            stmt.execute();
            System.out.println("Dados Gravados!");
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                chavePrimaria = chaves.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("exceção com recursos - localização");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada!");
        }
        return chavePrimaria;

    }

    @Override
    public List<Localizacao> listAll() {
        List<Localizacao> lista = new LinkedList<>();

        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.LISTALL_LOCALIZACAO.getSql())) {

            System.out.println("Conexão aberta!");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idLocalizacao = rs.getInt("idlocalizacao");
                String cidade = rs.getString("cidade");
                String uf = rs.getString("uf");
                lista.add(new Localizacao(idLocalizacao, cidade, uf));
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
    public int update(Localizacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Localizacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Localizacao findByID(int id) {
        Localizacao p = null;
        try (Connection connection = new ConnectionFactory().getConnection();
                PreparedStatement stmt
                = connection.prepareStatement(SQLs.FINDBYID_LOCALIZACAO.getSql())) {
            stmt.setInt(1, id);

            System.out.println("Conexão aberta!");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String cidade = rs.getString("cidade");
                String uf = rs.getString("uf");
                p = new Localizacao(cidade, uf);
            }

        } catch (SQLException e) {
            System.out.println("Exceção SQL - findById");
        } catch (Exception e) {
            System.out.println("Exceção no código!- findById");
        }
        return p;
    }
}
