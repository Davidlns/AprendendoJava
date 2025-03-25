package HerancaVisibilidade; //implementa a classe no pacote HerancaVisibilidade
import java.util.Scanner; //importa a classe Scanner de java.util

public class Myclass {
    public static void main(String[] args) {
        Scanner meuObjeto = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        String nomeUsuario = meuObjeto.nextLine();
        System.out.println("Seu nome é: "+ nomeUsuario);
    }
}
