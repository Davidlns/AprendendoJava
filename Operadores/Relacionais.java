package Operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        //retorna true pois a é menor que b, entao a operação é verdadeira
        boolean R1 = a < b;

        //retorna false, pois a não é maior que b, então a operação é falsa
        boolean R2 = a > b;

        //retorna true tanto se o valor for igual ou se for maior
        //nesse caso é true pois a sendo e somando com mais 1 é igual a 2,
        // então ele se torna igual a b que tambem é 2
        boolean R3 = a+1 >= b;

        //retorna true pois c=3 é maior que b=2
        boolean R4 = c >= b;

        //retorna false pois c=3 nao é menor e nem igual a a=1
        boolean R5 = c <= a;

        a = 2; // alterei o valor de a para 2

        // esse é o igual para comparação, retorna true, pois a=2 é igual a b=2
        boolean R6 = a == b;

        // o resultado deve ser: true, false, true, true, false, true
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
        System.out.println(R4);
        System.out.println(R5);
        System.out.println(R6);

    }
}
