package AlunosReferencia;

public class Referencia {
    private Aluno a1, a2;

    public Referencia() {
        a1 = new Aluno ("Jack", 20);
        a2 = new Aluno ("Bob", 30);

        System.out.println("Nome Aluno 1: " + a1.getNome());
        System.out.println("Nome Aluno 2: " + a2.getNome());

        a2 = a1;

        a2.definirNome("Charles");
        System.out.println("Nome Aluno 1: " + a1.getNome());
    }
    public void manipulaAluno(Aluno aluno) {
        aluno.definirNome("John");
    }
}
