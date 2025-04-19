package TratamentoException;

public class Excecaopersonalizada {
    public static void main(String[] args) {
        try{
            int resultado = divisao(20,0);
            System.out.println("Resultado: " + resultado);
        }catch (DivisaoPorZero e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static int divisao(int dividendo, int divisor) throws DivisaoPorZero {
        if (divisor == 0) {
            throw new DivisaoPorZero("O divisor não pode ser Zero!");
        }
        return dividendo / divisor;
    }
}

class DivisaoPorZero extends Exception {
    public DivisaoPorZero(String message) {
        super(message);
    }
}
