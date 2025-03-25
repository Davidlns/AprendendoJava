package Operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        int c = b;

        a = a + b; //a passara a receber o valor dele mesmo somado com b

        //formas de escrita simplificadas
        a += b; // a = a + b
        a -= b; // a = a - b
        a *= c; // a = a * c
        a /= c; // a = a / c
        a %= 2; // a = a % 2

    }
}
