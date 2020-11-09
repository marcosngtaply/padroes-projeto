package br.com.abstractFactory;

public class Fiesta implements CarroPopular {

    @Override
    public void exibirInfoPopular() {
        System.out.println("\nModelo: Fiesta\nFábrica: Ford\nCategoria: Popular");
    }
}
