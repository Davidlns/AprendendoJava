package AlunosReferencia;

public class Aluno {
    //atributos
    private String nome;
    private int idade;
    //Métodos
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void definirNome(String nome) {
        this.nome = nome;
    }
    public void definirIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
}
