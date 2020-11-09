package br.com.prototype;

public class Principal {
    public static void main(String[] args) {
        PalioPrototype prototipoPalio = new PalioPrototype();
        GolPrototype prototipoGol = new GolPrototype();
        FiestaPrototype prototipoFiesta = new FiestaPrototype();

        System.out.println("----------------- Carros -----------------");

        CarroPrototype palioNovo = prototipoPalio.clonar();
        palioNovo.setValorCompra(27900.0);
        CarroPrototype palioUsado = prototipoPalio.clonar();
        palioUsado.setValorCompra(21000.0);

        CarroPrototype GolNovo = prototipoGol.clonar();
        GolNovo.setValorCompra(30000.0);
        CarroPrototype GolUsado = prototipoGol.clonar();
        GolUsado.setValorCompra(24000.0);

        CarroPrototype FiestaNovo = prototipoFiesta.clonar();
        FiestaNovo.setValorCompra(32000.0);
        CarroPrototype FiestaUsado = prototipoFiesta.clonar();
        FiestaUsado.setValorCompra(26000.0);

        System.out.println("\nFIAT");
        System.out.println("Novo");
        System.out.println(palioNovo.exibirInfo());
        System.out.println("Usado");
        System.out.println(palioUsado.exibirInfo());

        System.out.println("\nWolkswagen");
        System.out.println("Novo");
        System.out.println(GolNovo.exibirInfo());
        System.out.println("Usado");
        System.out.println(GolUsado.exibirInfo());

        System.out.println("\nChevrolet");
        System.out.println("Novo");
        System.out.println(FiestaNovo.exibirInfo());
        System.out.println("Usado");
        System.out.println(FiestaUsado.exibirInfo());
    }
}