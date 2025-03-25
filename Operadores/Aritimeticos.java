package Operadores;

import javax.swing.*;
import java.util.Scanner;

public class Aritimeticos {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String input2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        double num1 = Double.parseDouble(input.replace(",","."));
        double num2 = Double.parseDouble(input2.replace(",","."));

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % num2;

        System.out.printf("Valor 1: %f%n", num1);
        System.out.printf("Valor 2: %2f%n%n", num2);
        System.out.printf("Soma: %2f%n", soma);
        System.out.printf("Subtração: %2f%n", sub);
        System.out.printf("Multplicação: %2f%n", mult);
        System.out.printf("Divisão: %2f%n", div);
        System.out.printf("Modulo: %2f%n", mod);

    }
}
