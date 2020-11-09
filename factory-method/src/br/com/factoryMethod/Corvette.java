package br.com.factoryMethod;

/**
 * Chevrolet Corvette
 */
public class Corvette implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Corvette\nFabricante: Chevrolet\n");
    }
}
