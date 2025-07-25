package Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4]; //melhor para arrays com valores indefinidos
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;


        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]); //primeira nota do array
        System.out.println(notasAlunoA[notasAlunoA.length - 1]); //ultima nota do array
        // System.out.println(notasAlunoA[4]); //!!Erro, fora dos limites do array

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //formas para arrays com valores diretos
        double totalAlunoB = 0;

        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);

    }

}
