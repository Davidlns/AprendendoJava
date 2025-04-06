package ConceitosPOO.Heranca;

import HerancaVisibilidade.Endereco;

import java.util.Calendar;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    //constructor
    public Pessoa(String nome, Calendar dataNascimento, long CPF, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = dataNascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade(22);
    }
    //metodos
    protected void atualizarNome(String nome) {
        this.nome = nome;
    }
    protected String getNome() {
        return nome;
    }
    protected void atualizarIdade(int idade) {
        this.idade = idade;
    }
    protected int getIdade() {
        return idade;
    }
    protected void atualizarCpf(long cpf) {
        this.CPF = cpf;
    }
    protected long getCpf() {
        return CPF;
    }
    protected void atualizarEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    protected Endereco getEndereco() {
        return endereco;
    }
    private int calculaIdade() {
        return idade;
    }
}
