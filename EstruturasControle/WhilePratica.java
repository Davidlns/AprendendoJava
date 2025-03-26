package EstruturasControle;

import javax.swing.*;

public class WhilePratica {
    public static void main(String[] args) {

        int contagem = 0;

        //esse loop se repetira até o valor de contagem ser 5
        //dentro do while manipulamos a variavel contagem para sempre que repetir somar 1;
        while (contagem < 5){
            contagem++; //contagem = contagem + 1;
            System.out.println("Contagem: " + contagem);
        }
        // apesar de poder ser usado em contextos onde se tem um valor determinado de repetições
        // while é mais utilizado em casos onde o numero de repetições é indefinido

        String senha = "";

        // enquanto o usuário nao digitar a senha correta o loop nao para
        // nesse caso nao sabemos quantas repetições serão, isso depende do usuário
        while (!senha.equalsIgnoreCase("Stop")){
            senha = JOptionPane.showInputDialog("Digite a senha: ");
        }


    }
}
