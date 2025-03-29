package Exercicios;

import javax.swing.*;

public class NumeroPrimoSwitch {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        int divisores = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        switch (divisores) {
            case 0:
                if (numero > 1) {
                    System.out.println("O numero "+ numero +" é primo!");
                } else if (numero == 1) {
                    System.out.println("O numero "+ numero +" não é primo! pois não tem 2 divisores!");
                }
                else {
                    System.out.println("Digite um numero válido!");
                }
                break;

            default: {
                System.out.println("O numero "+ numero +" não é primo!");
            }
        }
    }
}
