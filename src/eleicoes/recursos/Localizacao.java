package eleicoes.recursos;

import java.io.*;

public class Localizacao implements Serializable {

    private int idLocalizacao;
    private String cidade;
    private String uf;

    public Localizacao() {
    }

    public Localizacao(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public Localizacao(int idLocalizacao, String cidade, String uf) {
        this.idLocalizacao = idLocalizacao;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\nLocalizacao{" + "cidade=" + cidade + ", uf=" + uf + '}';
    }

}
