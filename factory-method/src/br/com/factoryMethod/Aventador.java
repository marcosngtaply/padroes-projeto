package br.com.factoryMethod;

/**
 * Lamborghini Aventador
 */
public class Aventador implements Carro {

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Aventador\nFabricante: Lamborghini\n");
    }
}
