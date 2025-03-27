package Exercicios;

import javax.swing.*;

public class NumeroPrimo {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int divisores = 0;

        if (num <= 0) {
            JOptionPane.showMessageDialog(null, "O numero deve ser maior que 0");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                        divisores++;
                }
            }

            if (divisores == 0) {
                System.out.printf("O número %d é primo!\n", num);
            } else {
                System.out.printf("O número %d não é primo \n", num);
            }
        }
    }
}
