package dao;

public enum SQLs {
    INSERT_URNA("insert into urna(zona, secao, situacao, idlocalizacao) values (?, ?, ?, ?)"),
    INSERT_LOCALIZACAO("insert into localizacao(cidade, uf) values (?, ?)"),
    LISTALL_URNA("select * from urna"),
    LISTALL_LOCALIZACAO("select * from localizacao"),
    UPDATE_URNA("update urna set zona=?, secao=?, situacao=?, idlocalizacao=? where idurna=?"),
    DELETE_URNA("delete from urna where zona=? and secao=?"),
    FINDBYSIT_URNA("select * from urna where situacao=?"),
    FINDBYLOC_URNA("select * from urna u inner join localizacao l on u.idlocalizacao = l.idlocalizacao where l.cidade=? and uf=?;"),
    FINDBYID_URNA("select * from urna where idurna=?"),
    FINDBYID_LOCALIZACAO("select * from localizacao where idlocalizacao=?");

    private final String sql;

    SQLs(String sql) {
        this.sql = sql;

    }

    public String getSql() {
        return sql;
    }
}
