package br.com.composite;

import java.util.ArrayList;

public abstract class Supervisor extends Funcionario{
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Supervisor(String nomeSupervisor) {
        this.nomeFuncionario = nomeSupervisor;
    }

    @Override
    public void printarNomeFuncionario() {
        System.out.println(this.nomeFuncionario);
    }

    @Override
    protected void adicionar(Funcionario novoFuncionario) {
        this.funcionarios.add(novoFuncionario);
    }

    @Override
    protected void remover(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }
}
