package br.com.abstractFactory;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n-------------- Fábrica FIAT -------------");
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        popular.exibirInfoPopular();

        System.out.println("\n-------------- Fábrica FORD -------------");
        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        popular.exibirInfoPopular();
    }
}
