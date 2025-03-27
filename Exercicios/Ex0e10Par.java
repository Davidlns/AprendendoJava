package Exercicios;
// criar um programa que receba um numero e verifique se esta entre 0 e 10 e se é par
import javax.swing.*;

public class Ex0e10Par {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

        boolean par = (num % 2 == 0);
        boolean intervalo = num >= 0 && num <= 10;

        if (intervalo == true) {
            System.out.println("O numero está dentro do intervalo de 0 a 10");
        }
        else {
            System.out.println("O numero está fora do intervalo de 0 a 10");
        }
        if (par == true) {
            System.out.println("O numero é par!");
        }else{
            System.out.println("O numero é impar!");
        }

        if (intervalo == true && par == true) {

            System.out.println("O numero tem os dois requisitos!");
        }
        else if (intervalo == false && par == false) {
            System.out.println("O numero não tem nenhum dos requisitos!");
        } else {
            System.out.println("O numero tem 1 dos requisitos!");
        }

        System.out.println("Fim do programa!");
    }
}
