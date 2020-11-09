package br.com.builder;

public class Principal {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());

        System.out.println("\n----------- FIAT -----------\n");
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);

        System.out.println("\n----------- VOLKSWAGEN -----------\n");
        concessionaria = new ConcessionariaDirector(new VolksBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
    }
}
