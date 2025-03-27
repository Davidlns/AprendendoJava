package Exercicios;

import javax.swing.*;

public class AreaTriangulo {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor da base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor da altura: "));

        double area = (base*altura) / 2;

        System.out.println("Area do Triangulo = " + area);
    }
}
