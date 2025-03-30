package ConceitosPOO;

import java.util.Random;

public class Pessoa {
    //atributos
    private String nome;
    private float codigo_identificador;
    private Random aleatorio;

    //construtor
    public Pessoa(String nome) {
        this.aleatorio = new Random();
        this.nome = nome;
        this.codigo_identificador = aleatorio.nextFloat();
    }

    //metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getCodigo_identificador() {
        return codigo_identificador;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("TESTE A");
        System.out.println("Nome: " + p1.getNome());
    }

}
