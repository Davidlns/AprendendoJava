package EstruturasControle;

import java.util.Scanner;

public class SwitchPratica {
    public static void main(String[] args) {
        //exemplo de switch sem break

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua faixa de Karatê: ");
        String faixa = sc.nextLine();

        // a odeia aqui é que um lutador de karate para atingir faixas superiores precisa passar por todas as que vem antes
        // ou seja se ele tem uma faixa preta, ele passa por todas as outras
        // o switch executa todas as cases abaixo (caso o break nao seja chamado)
        switch (faixa.toLowerCase()){
            case "preta": {
                System.out.println("Você tem a 1 Dan, e todas as faixas");
            }
            case "marrom" : {
                System.out.println("Você tem a 1 Kyu");
            }
            case "roxa" : {
                System.out.println("Você tem a 2 Kyu");
            }
            case "verde": {
                System.out.println("Você tem a 3 Kyu");
            }
            case "azul": {
                System.out.println("Você tem a 4 Kyu");
            }
            case "laranja": {
                System.out.println("Você tem a 5 Kyu");
            }
            case "amarela": {
                System.out.println("Você tem a 6 Kyu");
            }
            case "branca": {
                System.out.println("Você tem a 7 Kyu iniciante");
                break;
            }
            default: {
                System.out.println("Digite uma cor válida!");
            }
        }
    }
}
