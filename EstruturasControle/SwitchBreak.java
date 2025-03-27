package EstruturasControle;

import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi sua nota: ");
        int nota = sc.nextInt();
        String conceito = "";

        // utilizamos o break na parte do codigo onde queremos que o programa saia do switch
        // nesse caso ele roda somente o conteudo do case e sai do switch
        switch (nota) {
            case 10: case 9: {
                conceito = "A";
                break;
            }
            case 8: case 7: {
                conceito = "B";
                break;
            }
            case 6: case 5: {
                conceito = "C";
                break;
            }
            case 4: case 3: {
                conceito = "D";
                break;
            }
            case 2: case 1: case 0: {
                conceito = "F";
                break;
            }
        }

        System.out.println("Sua nota é conceito: "+ conceito);
        sc.close();
    }
}