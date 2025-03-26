package EstruturasControle;

import java.util.Scanner;

public class DesafioLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int QtdeNotas = 0;
        int soma = 0;
        double nota = 0;

        while (nota != -1) {

            System.out.println("Digite uma nota: ");
            nota = input.nextDouble();

            if(nota >= 0 && nota <= 10) {
                soma += nota;
                QtdeNotas++;
            }
        }
        double media = soma / QtdeNotas;
        System.out.println("Media: " + media);

    }
}
