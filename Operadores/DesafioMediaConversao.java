package Operadores;

import javax.swing.*;

public class DesafioMediaConversao {
    public static void main(String[] args) {
        String Input1 = JOptionPane.showInputDialog("Digite o primeiro salário: ");
        String Input2 = JOptionPane.showInputDialog("Digite o segundo salário: ");
        String Input3 = JOptionPane.showInputDialog("Digite o terceiro salario: ");

        double salario1 = Double.parseDouble(Input1.replace(",", "."));
        double salario2 = Double.parseDouble(Input2.replace(",", "."));
        double salario3 = Double.parseDouble(Input3.replace(",", "."));

        double soma = salario1 + salario2 + salario3;
        double media = soma / 3;

        System.out.printf("A média de salário dos ultimos 3 meses: %.2f", media);

    }
}
