package Strings;

public class TipoFuncoes {
    public static void main(String[] args) {

        String nome = "David";
        String sobrenome = "Lins";

        System.out.println(nome);
        System.out.println(sobrenome);

        //funcao concat é usada para juntar 2 strings
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        System.out.println(nomeCompleto);

        // length é usado para saber a quantidade de caracteres de uma string (David) = 5 letras
        int numLetras = nome.length();
        System.out.println(numLetras);

        //troca um caractere ou um conjunto por outro, nesse caso trocou Lins por Amaral
        nomeCompleto = nomeCompleto.replace("Lins","Amaral");
        System.out.println(nomeCompleto);

        //toLowerCase deixa todas as letras minusculas
        nomeCompleto = nomeCompleto.toLowerCase();
        System.out.println(nomeCompleto);

        //toUpperCase deixa todas as letras MAIUSCULAS
        nomeCompleto = nomeCompleto.toUpperCase();
        System.out.println(nomeCompleto);

        //compara as strings e verifica se são iguais
        System.out.println("a" == "a");

        String Letra = new String("a");

        //nesse caso mesmo sendo igual a variavel string com a letra "b", ele retorna falso
        //isso também se repete em casos de entrada de valores usando Scanner
        System.out.println("a" == Letra);

        //solução seria a seguinte:
        //.equals verifica se a string "a" é igual ao objeto Letra do tipo String
        //usar o .equals é mais eficiente para comparação de strings
        System.out.println("a".equals(Letra));

        String Letra2 = "  a  ";
        System.out.println("a".equals(Letra2));

        //.trim remove todos os espaços em branco
        Letra2 = Letra2.trim();
        System.out.println("a".equals(Letra2));

    }
}
