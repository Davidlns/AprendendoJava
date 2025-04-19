package TratamentoException;

public class ExemploExcecao {
    public static void main(String[] args) {

        System.out.print("Entre com uma senha: ");
        String senha = "123a";
        System.out.println(senha);

        try{
            validarSenha(senha);
            System.out.println("Senha invalida!");
        }catch (SenhaInvalidaExcecao e) {
            System.out.println("Senha invalida: "+ e.getMessage());
        }
    }

    public static void validarSenha(String senha) throws SenhaInvalidaExcecao {
        if (senha.length() < 5) {
            throw new SenhaInvalidaExcecao("A senha deve ter pelo menos 5 caracteres");
        }
        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaExcecao("A senha deve conter no mínimo 1 digito");
        }
    }
}

class SenhaInvalidaExcecao extends Exception {
    public SenhaInvalidaExcecao(String message) {
        super(message);
    }
}
