package Exercicios;

import java.util.Scanner;

public class CalcCuboQuad {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();

        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        System.out.println("Quadrado do valor = " +quadrado);
        System.out.println("Cubo do valor = " +cubo);
    }
}
