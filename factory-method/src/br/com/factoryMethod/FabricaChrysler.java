package br.com.factoryMethod;

public class FabricaChrysler implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Cirrus();
    }
}