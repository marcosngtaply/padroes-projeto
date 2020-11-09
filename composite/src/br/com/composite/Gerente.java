package br.com.composite;

public class Gerente extends Supervisor {
    public Gerente(String nomeSupervisor) {
        super(nomeSupervisor);
        this.nomeFuncionario = nomeSupervisor;
    }

    @Override
    public void printarNomeFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionario : funcionarios) {
            funcionario.printarNomeFuncionario();
        }
    }

    @Override
    protected void adicionar(Funcionario novoFuncionario) {
        super.adicionar(novoFuncionario);
    }

    @Override
    protected void remover(Funcionario funcionario) {
        super.remover(funcionario);
    }
}
