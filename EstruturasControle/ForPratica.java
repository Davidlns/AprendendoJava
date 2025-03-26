package EstruturasControle;

public class ForPratica {
    public static void main(String[] args) {
        //for é usado para numeros definidos de repetições

        // for (cria contador ; condição de repetição ; incremento do contador)
        // soma 1 sempre que repete
        for(int i = 1; i <= 10; i++){
            System.out.println("i: " + i);
        }

        // subtrai 1 sempre que repete
        for(int i = 9; i > 0; i--){
            System.out.println("i: " + i);
        }

        // for usado dentro de outro for
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println("j: " + j);
            }
        }
    }
}
