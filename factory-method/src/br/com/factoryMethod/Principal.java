package br.com.factoryMethod;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n-------------- Carros --------------\n");

        FabricaDeCarro fabrica = new FabricaLamborghini();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();

        fabrica = new FabricaChrysler();
        carro = fabrica.criarCarro();
        carro.exibirInfo();

        fabrica = new FabricaNissan();
        carro = fabrica.criarCarro();
        carro.exibirInfo();

        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
    }
}
