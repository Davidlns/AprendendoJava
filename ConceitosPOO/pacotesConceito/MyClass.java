package ConceitosPOO.pacotesConceito;

import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner meuObjeto = new Scanner(System.in);
        System.out.println("Digite o nome do Usuário: ");

        String nomeUsuario = meuObjeto.nextLine();
        System.out.println("O nome do usuário é: " + nomeUsuario);
    }
}
