package br.com.composite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do(a) Gerente: ");
        Funcionario gerente = new Gerente(scanner.nextLine());
        System.out.println("Digite o nome do(a) Atendente: ");
        Funcionario atendente = new Atendente(scanner.nextLine());
        System.out.println("Digite o nome do(a) Caixa: ");
        Funcionario caixa = new Caixa(scanner.nextLine());

        System.out.println("\nAdicionando Funcionário...\nGerente - " + gerente.getNomeFuncionario());
        gerente.adicionar(atendente);
        System.out.println("\nFuncionários Cadastrados");
        gerente.printarNomeFuncionario();
        System.out.println("\nAdicionando Funcionário...\nGerente - " + gerente.getNomeFuncionario());
        gerente.adicionar(caixa);
        System.out.println("\nFuncionários Cadastrados");
        gerente.printarNomeFuncionario();
        System.out.println("\nRemovendo Funcionário...\nGerente - " + gerente.getNomeFuncionario());
        gerente.remover(atendente);
        System.out.println("\nFuncionários Cadastrados");
        gerente.printarNomeFuncionario();
    }
}
