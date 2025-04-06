package ConceitosPOO.AgrupamentoClasses;

public class Discente {
    //Atributos
    private String matricula, nome, naturalidade;
    //Métodos
    public Discente(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }
        @Override
        public String toString() {
            return String.format("%s: %s", matricula, naturalidade);
        }
        public String recuperarNaturalidade() {
            return naturalidade;
        }
}
