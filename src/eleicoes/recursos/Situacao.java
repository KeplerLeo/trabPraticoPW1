package eleicoes.recursos;

import java.io.*;

public enum Situacao implements Serializable {
    FECHADA, ABERTA, ENCERRADA;

    public static Situacao getSituacao(String situacao) {
        for (Situacao sit : Situacao.values()) {
            if (sit.toString().equals(situacao.toUpperCase())) {
                return sit;
            }
        }
        return null;
    }
}
