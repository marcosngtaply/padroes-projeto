package br.com.abstractFactory;

public class Palio implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("\nModelo: Palio\nFábrica: Fiat\nCategoria: Popular");
    }
}
