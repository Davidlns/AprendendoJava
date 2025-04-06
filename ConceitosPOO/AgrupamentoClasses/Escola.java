//package ConceitosPOO.AgrupamentoClasses;
//
//import HerancaVisibilidade.Endereco;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Escola {
//    //Atributos
//    private String nome, CNPJ;
//    private Endereco endereco;
//    private List departamentos;
//    private List discentes;
//
//    //Construtor
//    public Escola(String nome, String CNPJ) {
//        this.nome = nome;
//        this.CNPJ = CNPJ;
//        this.departamentos = new ArrayList<Departamento>();
//        this.discentes = new ArrayList<Discente>();
//    }
//
//    //Métodos
//    public void CriarDepartamento(String nomeDepartamento) {
//        departamentos.add(new Departamento(nomeDepartamento));
//    }
//    public void FecharDepartamento(Departamento departamento) {
//        departamentos.remove(departamento);
//    }
//    public void matricularAluno(Discente novoAluno) {
//        discentes.add(novoAluno);
//    }
//    public void trancarMatriculaAluno(Discente novoAluno) {
//        discentes.remove(novoAluno);
//    }
//
//    public void AgruparAlunos() {
//        Map<String, List<Discente>> agrupamento = new HashMap<>();
//
//        for (Discente a: discentes){
//            if (!agrupamento.containsKey(a.recuperarNaturalidade())) {
//                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
//            }
//            agrupamento.get(a.recuperarNaturalidade()).add(a);
//        }
//
//    System.out.println("Resultados do Agrupamento por naturalidade: " + agrupamento);
//
//    }
//}
