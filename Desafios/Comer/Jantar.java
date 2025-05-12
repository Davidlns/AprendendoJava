package Desafios.Comer;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Nay", 59);
        Comida comida1 = new Comida("Frango", 0.400);
        Comida comida2 = new Comida("Arroz", 0.350);
        Comida comida3 = new Comida("Feijão", 0.250);

        pessoa1.Apresentar();

        pessoa1.Comer(comida1);
        pessoa1.Comer(comida2);

        pessoa1.Apresentar();

        pessoa1.Comer(comida3);
        pessoa1.Apresentar();
        
    }
}
