package EstruturasControle;
// retorne 5 "#" em ordem crescente (começando em 1 e indo até 5) sem utilizar numeros para controlar o laço
public class DesafioFor {
    public static void main(String[] args) {
        String hash = "#";
        for (String hashb = "#"; !hash.equals("######"); hash += hashb){
            System.out.println(hash);
        }
    }
}
