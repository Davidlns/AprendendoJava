package ConceitosPOO.ClasseAbstrada;
// Classe Abstrata
abstract class Animal {
    //metodo abstrato
    public abstract void emitirSom();
    //metodo concreto
    public void dormir() {
        System.out.println("Zzzz...");
    }
}

//subclasse concreta
class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("Latir!");
    }
}
// subclasse concreta
class Gato extends Animal {
    public void emitirSom() {
        System.out.println("Miar!");
    }
}
