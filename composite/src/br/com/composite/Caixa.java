package br.com.composite;

public class Caixa extends Funcionario{
    public Caixa (String nomeDoCaixa) {
        this.nomeFuncionario = nomeDoCaixa;;
    }

    @Override
    public void printarNomeFuncionario() {
        System.out.println(this.nomeFuncionario);
    }

    @Override
    protected void adicionar(Funcionario funcionario) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void remover(Funcionario funcionario) {
        // TODO Auto-generated method stub

    }
}
