package ConceitosPOO.ClasseseMetodos;

public class AtributoClasse {
    int a = 1;
    static int b = 2;

    // um metodo static só pode acessar diretamente um atributo, caso ele também seja static
    // ao contrario, será necessario instanciar um objeto para acessar o atributo através dele
    public static void main(String[] args) {
        AtributoClasse instA = new AtributoClasse();
        System.out.println("O valor de A é " + instA.a);
        System.out.println("O valor de B é " + b);
    }
}
