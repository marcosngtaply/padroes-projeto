package br.com.builder;

public class FiatBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.preco = 6000.00;
    }

    @Override
    public void buildDscMotor() {
        carro.dscMotor = "1.6 Flex";
    }

    @Override
    public void buildAnoDeFabricacao() {
        carro.anoDeFabricacao = 2010;
    }

    @Override
    public void buildModelo() {
        carro.modelo = "Palio";
    }

    @Override
    public void buildMontadora() {
        carro.montadora = "Fiat";
    }

}
