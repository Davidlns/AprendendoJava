package ConceitosPOO.Heranca;

import HerancaVisibilidade.Endereco;

import java.util.Calendar;

public class Principal {
    //Atributos
    private static Aluno aluno;
    private static Endereco endereco;
    //main
    public static void main(String[] args) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco("Lino Gomes", "Conde", "Bahia", 48300000);
        aluno = new Aluno("David", data, 901564098, endereco);
        aluno.atualizarIdade(22);
        idade = aluno.getIdade();
    }
}
