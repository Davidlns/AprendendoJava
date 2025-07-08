package Arrays.Desafio;

import javax.swing.JOptionPane;

public class desafioArrayMedia {

    public static void main(String[] args) {

        int nNotas = Integer.parseInt(JOptionPane.showInputDialog("Quatas notas você quer adicionar ?"));

        double[] notas = new double[nNotas];

        for (int i = 0; i < nNotas; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ": "));
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / nNotas;
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}
