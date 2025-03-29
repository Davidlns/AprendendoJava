package Exercicios;

import javax.swing.*;
//enquanto receber positivos, some e mostre na tela, ao receber negativo encerre o programa.
public class NumerosPositivosWhile {
    public static void main(String[] args) {
        double soma = 0;
        double input = 1;

        while (input >= 0){
            input = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));

            if (input >= 0) {
                soma += input;
                JOptionPane.showMessageDialog(null, "Soma: " + soma);
            }
            else {
                JOptionPane.showMessageDialog(null, "Você digitou um valor negativo e o programa será encerrado!\n");
            }
        }
    }
}
