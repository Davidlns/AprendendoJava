package HerancaVisibilidade;

import java.util.Calendar;

public class Aluno extends Pessoa{
    //atributos
    private String matricula;
    //métodos
    public Aluno(String nome, Calendar dataNascimento, long CPF, Endereco endereco) {
        super(nome, dataNascimento, CPF, endereco);
    }
}
