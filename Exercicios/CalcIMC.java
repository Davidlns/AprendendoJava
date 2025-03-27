package Exercicios;

import javax.swing.*;

public class CalcIMC {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ").replace(",","."));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metro (ex: 1,80): ").replace(",","."));
        double imc = peso/(Math.pow(altura, 2));

        if(imc < 18.5 && imc > 0){
            JOptionPane.showMessageDialog(null, imc + "= Abaixo do peso");
        }
        else if(imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, imc + "= Peso ideal");
        }
        else if(imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, imc + "= Sobrepeso");
        }
        else if(imc >= 30){
            JOptionPane.showMessageDialog(null, imc + "= Obesidade");
        }
        else if(imc < 0){
            JOptionPane.showMessageDialog(null, "Valores digitados são invalidos!");
        }
    }
}
