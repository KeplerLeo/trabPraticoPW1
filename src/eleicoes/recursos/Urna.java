package eleicoes.recursos;

import dao.*;
import java.io.Serializable;
import java.util.*;

public class Urna implements Serializable {

    
    private int zona;
    private int secao;
    private static final int MAX_VOTOS = 300;
    private Situacao situacao;
    private Localizacao localizacao;

    public Urna() {
    }

    public Urna(int zona, int secao, Situacao situacao, Localizacao localizacao) {
        this.zona = zona;
        this.secao = secao;
        this.situacao = situacao;
        this.localizacao = localizacao;

    }

  
    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Urna{" + "zona=" + zona + ", secao=" + secao + ", situacao=" + situacao + ", localizacao=" + localizacao + '}';
    }

    public int insert() {
        return new UrnaDAO().insert(this);
    }
    
    public int delete() {
        return new UrnaDAO().deleteBy(this);
    }

    public List<Urna> listAll() {
        return new UrnaDAO().listAll();
    }

    public List<Urna> listSit(String sit) {
        return new UrnaDAO().findBySit(sit);
    }

    public List<Urna> listLoc(String cid, String uf) {
        return new UrnaDAO().findByLoc(cid, uf);
    }

}
