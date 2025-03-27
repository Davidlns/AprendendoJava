package Exercicios;
//Criar um programa que informa se o ano atual é ou não bissexto
import java.util.Calendar;
import java.util.Date;

public class AnoBissexto {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int anoAtual = calendar.get(Calendar.YEAR);
        System.out.println("Ano Atual: "+anoAtual);

        if(anoAtual % 4 == 0) {
            System.out.println("O ano atual é bissexto!");
        }
        else {
            System.out.println("O ano atual não é bissexto!");
        }

    }
}
