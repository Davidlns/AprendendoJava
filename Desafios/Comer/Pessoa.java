package Desafios.Comer;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    Pessoa() {
        this.nome = "David";
        this.peso = 70.0;
    }

    public void Comer (Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    public void Apresentar () {
        System.out.println("Olá eu sou " + nome + " e tenho " + peso + "kg");
    }
}
