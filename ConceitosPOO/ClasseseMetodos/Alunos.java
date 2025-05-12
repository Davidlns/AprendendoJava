package ConceitosPOO.ClasseseMetodos;

import java.util.Random;

public class Alunos {
    //atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    //Construtor
    public Alunos(String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    //metodos
    public void definirNome(String nome) {
        this.nome = nome;
    }
    public void definirIdade(int idade) {
        this.idade = idade;
    }

}
