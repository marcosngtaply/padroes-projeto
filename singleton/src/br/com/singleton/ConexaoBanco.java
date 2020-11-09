package br.com.singleton;

import java.sql.Connection;

public class ConexaoBanco {

    private Connection conexao;
    private String nomeBanco;

    private static ConexaoBanco instancia;

    private ConexaoBanco() {
        //nome do banco, usuario, senha etc
    }

    public static synchronized ConexaoBanco getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }

    public String conectar() {
        return "\nBanco Conectado!";
    }

    public String desconectar() {
        return "\nBanco Desconectado!";
    }
}
