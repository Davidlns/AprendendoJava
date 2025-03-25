package HerancaVisibilidade;

import java.util.Calendar;

public class Empregado {
    protected String matricula;
    private Calendar dataAdmissao, data_demissao;
//metodods
    public Empregado(String nome, Calendar dataNacimento, long CPF, String endereco) {
        super();
        this.matricula = matricula;
        dataAdmissao = Calendar.getInstance();

    }

    public void demitirEmpregado() {
        data_demissao = Calendar.getInstance();
    }
    protected void gerarMatricula() {
        this.matricula = matricula;
    }
    protected String getMatricula() {
        return this.matricula;
    }
}
