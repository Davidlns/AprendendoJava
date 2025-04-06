package ConceitosPOO.Heranca;

import HerancaVisibilidade.Endereco;

import java.util.Calendar;

public class Aluno extends Pessoa {

    //atributos
    private String matricula;

    //Métodos
    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }
}
