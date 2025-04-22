package TratamentoException;

import java.io.IOException;

public class EncadeamentoExcecao {
    public static void main(String[] args) {
        try {
            abrirArquivo();
        }catch (AbrirArquivoExcecao e) {
            System.out.println("Error: "+ e.getMessage());
            System.out.println("Causa raiz: " + e.getCause().getMessage());
        }
    }
    public static void abrirArquivo() throws AbrirArquivoExcecao {
        try {
            //simulando uma excecao ao abrir o arquivo
            throw new IOException("Arquivo inexistente");
        }catch (IOException e) {
            // Envolvendo a excecao capturada em uma excecao personalizada
            throw new AbrirArquivoExcecao("Ocorreu um erro ao abrir o arquivo", e);
        }
    }
}
class AbrirArquivoExcecao extends Exception {
    public AbrirArquivoExcecao(String message, Throwable cause) {
        super(message, cause);
    }
}
