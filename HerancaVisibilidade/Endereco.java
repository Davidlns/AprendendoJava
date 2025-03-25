package HerancaVisibilidade;

public class Endereco {
    private String Rua;
    private String Cidade;
    private String Estado;
    private long CEP;

    public Endereco(String Rua, String Cidade, String Estado, long CEP) {
        this.Rua = Rua;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.CEP = CEP;
    }

    public String getRua() {
        return Rua;
    }
    public void setRua(String Rua) {
        this.Rua = Rua;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public long getCEP() {
        return CEP;
    }
    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

}
