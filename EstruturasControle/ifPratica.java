package EstruturasControle;

import javax.swing.*;
//else é o contrario da condição em if, caso seja false ele irá seguir para else
//else if é para situações onde precisamos de mais de uma condição, pode haver vários else if
public class ifPratica {
    public static void main(String[] args) {

        double Input = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: (de 0 a 10) "));

        //segue a condição caso ela seja true, pode haver varias condições com && ou ||
        if(Input > 0 && Input <= 10){
            if(Input >= 7){
                JOptionPane.showMessageDialog(null, "Aprovado com sucesso!");
            } else if (Input >= 5) {
                JOptionPane.showMessageDialog(null, "Você Esta de Recuperação!");
            } else{
                JOptionPane.showMessageDialog(null, "Infelizmente você foi reprovado!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Digite um valor vádido!");
        }
    }
}
