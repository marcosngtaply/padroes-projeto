package br.com.abstractFactory;

public class Siena implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("\nModelo: Siena\nFábrica: Fiat\nCategoria: Sedan");
    }
}
