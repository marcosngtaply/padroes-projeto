package br.com.singleton;

public class Principal {
    public static void main(String[] args) {
        System.out.println("-------- Inciando Sistema ----------\n");
        System.out.println(ConexaoBanco.getInstance().conectar());

        System.out.println("\nVárias coisas aconteceram\n");

        System.out.println(ConexaoBanco.getInstance().desconectar());
    }
}
