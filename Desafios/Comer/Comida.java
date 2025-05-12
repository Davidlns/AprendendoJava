package Desafios.Comer;

public class Comida {
    String nome;
    double peso;

    Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    Comida() {
        this.nome = "Bisteca";
        this.peso = 0.350;
    }
}
