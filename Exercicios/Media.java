package Exercicios;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        String num1 = input.nextLine().replace(",",".");

        System.out.println("Digite nota 2: ");
        String num2 = input.nextLine().replace(",",".");

        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);

        double media = (n1+n2)/2;
        String status = "";

        if (media >= 7)
            status = "Aprovado";
        else if (media > 4 && media < 7)
            status = "Recuperação";
        else if (media <= 4)
            status = "Reprovado";
        else
            System.out.println("Média inválida!");

        System.out.println("\nMédia: "+media+"\nSituação: "+status);


    }
}
