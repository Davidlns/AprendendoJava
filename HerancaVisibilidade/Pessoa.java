package HerancaVisibilidade;

import java.util.Calendar;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private Calendar dataNascimento;
    private Long CPF;
    private Endereco endereco;
    //Métodos
    public Pessoa(String nome, Calendar dataNascimento, Long CPF, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        AtualizarIdade(23);
    }

    protected void atualizarNome(String nome) {
        this.nome = nome;
    }
    protected String recuperarNome() {
        return this.nome;
    }
    public void AtualizarIdade(int idade) {
        this.idade = idade;
    }
    protected int recuperarIdade(){
        return this.idade;
    }
    protected void atualizarCPF(long CPF){
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco (){
        return this.endereco;
    }
    private void calcularIdade(){
        this.idade = (int)(Math.random()*100);
    }
}
