package br.com.composite;

public abstract class Funcionario {
    String nomeFuncionario;

    public void printarNomeFuncionario() {
        System.out.println(this.nomeFuncionario);
    }

    protected abstract void adicionar(Funcionario funcionario);

    protected abstract void remover(Funcionario funcionario);

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
