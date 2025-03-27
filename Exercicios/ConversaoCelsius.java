package Exercicios;

import javax.swing.*;

public class ConversaoCelsius {
    public static void main(String[] args) {
        double input = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em Fahrenheit: "));
        double calcCelsius = (input - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, "Celsius = "+calcCelsius);
    }
}
