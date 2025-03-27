package EstruturasControle;

public class BreakFor {
    public static void main(String[] args) {

        //O break para o for antes de ele finalizar totalmente
        // com o uso do if podemos definir uma condição para o break
        for(int i = 0; i<10; i++){
            if(i==8) {
                break;
            }
            // esse tipo de estrutura não é muito indicado pois complica muito o codigo
            // torna mais dificil a legibilidade
            // estou utilizando apenas para fins de aprendizagem caso encontre uma situação parecida
            System.out.println(i);
        }
    }
}
