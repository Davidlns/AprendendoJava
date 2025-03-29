//receba 10 valores e imprima o maior.
package Exercicios;

import javax.swing.*;

public class MaiorNumero {
    public static void main(String[] args) {
        double maiorN = 0;
        double input;

        for (int i = 1; i <= 10; i++) {
            input = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
            if (input > maiorN) {
                maiorN = input;
            }
        }
        JOptionPane.showMessageDialog(null, "Maior numero: " + maiorN);
    }
}
