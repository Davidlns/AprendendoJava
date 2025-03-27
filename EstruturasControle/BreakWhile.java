package EstruturasControle;

import java.util.Scanner;

public class BreakWhile {
    public static void main(String[] args) {

        String Senha = "java";
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        // aqui usamos break para parar o loop while caso o usuario digite a senha correta

        while (loop) {
            System.out.println("Enter password: ");
            String Input = sc.nextLine();

            if (Input.equalsIgnoreCase(Senha)) {
                System.out.println("Senha correta!");
                break;
            }

        }
    }
}
