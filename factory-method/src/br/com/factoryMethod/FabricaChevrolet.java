package br.com.factoryMethod;

public class FabricaChevrolet implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Corvette();
    }
}
