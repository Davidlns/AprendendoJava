package TratamentoException;

public class ExcecoesExplicitas {
    public static int getElemento (int i, int [] vet) {
        try {
            if(i < 0 || i > 3)
                throw new IllegalArgumentException();
        }catch (Exception e) {
            System.out.println("Erro: Indice fora dos limites do vetor");
        }
        return vet[i];
    }

    public static void main(String[] args) {
        int [] vetor = {10,20,30,40};
        int x = getElemento(5, vetor);
        System.out.println("O elemento na quinta posição do vetor é: "+x);
    }
}
