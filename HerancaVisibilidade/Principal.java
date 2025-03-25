package HerancaVisibilidade;

import java.util.Calendar;

public class Principal {
    //Atributos
    private static Aluno aluno;
    private static Endereco endereco;
    //Método main
    public static void main(String[] args) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco ("CINCO", "NEW YORK", "NEW YORK", 0700);
    }
}
