package Exercicios;

import javax.swing.*;

public class Bhaskara {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: ").replace(",","."));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: ").replace(",","."));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: ").replace(",","."));

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta = " + delta);
    }
}
