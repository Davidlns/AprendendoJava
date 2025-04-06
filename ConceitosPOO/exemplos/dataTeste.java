package ConceitosPOO.exemplos;

public class dataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        System.out.println(d1.juntarData());

        Data d2 = new Data(13,07,2002);
        System.out.println(d2.juntarData());
    }
}
