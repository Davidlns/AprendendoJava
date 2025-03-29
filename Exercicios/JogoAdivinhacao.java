package Exercicios;

import javax.swing.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        int sorteio = new Random().nextInt(101);
        System.out.println(sorteio);
        int input;

        for (int i = 10; i >= 0; i--) {
            if (i == 0) {
                System.out.println("Que pena, suas tentativas acabaram!!");
            }else {
                System.out.println("Tentativas restantes: " + i + "\n");
                input = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o numero: "));
                if (input == sorteio) {
                    System.out.println("PARABENS! VOCÊ ACERTOU O NUMERO DO SORTEIO!");
                    break;
                }
                else {
                    if (input < sorteio) {
                        System.out.printf("%d é menor que o numero sorteado!\n", input);
                    }
                    else {
                        System.out.printf("%d é maior que o numero sorteado!\n", input);
                    }
                }
            }

        }

    }
}
