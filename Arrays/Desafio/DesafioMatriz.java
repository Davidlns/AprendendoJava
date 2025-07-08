package Arrays.Desafio;

import javax.swing.*;
import java.util.Arrays;

public class DesafioMatriz {
    public static void main(String[] args) {
        int nAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos: "));
        int nNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas dos alunos: "));

        double [] [] Alunos = new double[nAlunos][nNotas];
        double [] Soma = new double [nAlunos];
        double [] Media = new double [nAlunos];
        double somaMedias = 0;

         for (int i = 0; i < nAlunos; i++) {
            for (int j = 0; j < nNotas; j++) {
                Alunos [i][j] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + " : "));
                Soma[i] += Alunos[i][j];
                Media[i] = Soma[i] / nNotas;
            }
            somaMedias += Media[i];
        }
         double mediaGeral = somaMedias / nAlunos;
         JOptionPane.showMessageDialog( null,"A média geral da turma é: " + mediaGeral);

         for (double[] notasDoAluno: Alunos) {
             System.out.println(Arrays.toString(notasDoAluno));
         }

    }
}
