package Operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        //Unarios

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        // quando os sinais vem antes a ordem de precedencia é alta, quando os sinais vem depois a ordem de precedencia é baixa
        // na ordem de precedencia baixa, você tira a urgencia da operação, e outras operações podem ser feitas antes da mesma

        System.out.println(a);
        System.out.println(b);

        ++a;
        b++;

        System.out.println("\n"+a);
        System.out.println(b);


        System.out.println(++a == b); //true
        System.out.println(b-- == a); //true
        System.out.println(++a == b--); //false
    }
}
