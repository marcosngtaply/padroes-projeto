package br.com.abstractFactory;

public class FiestaSedan implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("\nModelo: Fiesta\nFábrica: Ford\nCategoria: Sedan");
    }
}
