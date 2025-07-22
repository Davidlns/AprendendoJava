package Fundamentos;

import javax.swing.*;

public class Temperatura {

    public static void main(String[] args) {
        double tempF = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura em F: "));

        double tempC = (tempF-32) * 5/9;

        JOptionPane.showMessageDialog(null, "Temperatura em C: " + tempC);
    }
}
