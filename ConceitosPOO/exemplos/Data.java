package ConceitosPOO.exemplos;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(int recebeDia, int recebeMes, int recebeAno) {
        dia = recebeDia;
        mes = recebeMes;
        ano = recebeAno;
    }

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    String juntarData () {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
