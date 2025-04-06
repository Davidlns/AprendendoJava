package ConceitosPOO.Heranca;

import HerancaVisibilidade.Endereco;

import java.util.Calendar;

public class Empregado extends Pessoa {
    //atributos
    protected String matricula;
    private Calendar data_admissao, data_demissao;
    //construtor
    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        gerarMatricula();
        this.data_admissao = Calendar.getInstance();
    }
    //metodos
    public void demitirEmpregado() {
        data_admissao = Calendar.getInstance();
    }
    protected void gerarMatricula() {
        this.matricula = "Matricula não definida";
    }
    protected String recuperarMatricula() {
        return this.matricula;
    }
}
