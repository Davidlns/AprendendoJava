package Operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 7.6;

        // ? retorna o resultado caso a expressão seja verdadeira
        //: retorna o resultado caso a expressao seja falsa
        // maneira simplificada de if e else

        String resultado = (media >= 7.5) ? "Aprovado" : "Reprovado";

        // como media = 7.6 é maior que 7.5, logo ele retornará "Aprovado"
        System.out.println(resultado);

        media = 6;
        resultado = (media >= 7.5) ? "Aprovado" : "Reprovado";

        //Nesse caso retorna "Reprovado", pois media = 6 é menor que 7.5
        System.out.println(resultado);
    }
}
