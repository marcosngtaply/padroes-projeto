package br.com.factoryMethod;

public class FabricaLamborghini implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Aventador();
    }
}
