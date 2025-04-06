package ConceitosPOO.ClasseAbstrada;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        cachorro.dormir();

        gato.emitirSom();
        gato.dormir();
    }
}
