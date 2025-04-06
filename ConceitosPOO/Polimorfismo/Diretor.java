package ConceitosPOO.Polimorfismo;

import ConceitosPOO.Heranca.Empregado;
import HerancaVisibilidade.Endereco;

import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Empregado {
    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }
    //subscrevi o metodo que ja existe na classe empregado
    protected void gerarMatricula() {
        matricula = "E-" + UUID.randomUUID().toString();
    }

    protected void alterarMatricula() {
        gerarMatricula();
    }

    protected void alterarMatricula(String matricula) {
        this.matricula = matricula;
    }
}
