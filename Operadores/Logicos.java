package Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean logico = true;
        boolean logico2 = false;

        // o simbolo ! inverte o sentido da operação, se era false vira true, e vice versa
        boolean logico3 = !false;

        // com  and, os dois devem ser true ou o resultado será false
        if (logico && logico3) {
            System.out.println("\nAmbos devem ser true: "+ (logico && logico3));
        }
        // com Or, somente um boolean precisa ser true para retornar true
        if (logico || logico2) {
            System.out.printf("somente 1 precisa ser True -> logico = %b, logico2 = %b \n",logico, logico2);
        }
        // com Xor ambos devem ser diferentes (Só retorna true caso um seja true e o outro false)
        if (logico ^ logico2) {
            System.out.println("Ambos devem ser diferentes: logico1 ^ logico2 = "+ (logico ^ logico2));
        }
    }
}
