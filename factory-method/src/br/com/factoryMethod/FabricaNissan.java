package br.com.factoryMethod;

public class FabricaNissan implements FabricaDeCarro {

    @Override
    public Carro criarCarro() {
        return new Skyline();
    }
}
