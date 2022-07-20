package fundamentos.operadores;

import javax.swing.*;

public class DesafioCalculadora {

    public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro numero: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo numero: "));
        String operacao = JOptionPane.showInputDialog("Digite o simbolo da operação desejada: [ +, -, *, /, %]");

        double resultado = "+".equals(operacao) ? n1 + n2 : 0;
        resultado = "-".equals(operacao) ? n1 - n2 : resultado;
        resultado = "*".equals(operacao) ? n1 * n2 : resultado;
        resultado = "/".equals(operacao) ? n1 / n2 : resultado;
        resultado = "%".equals(operacao) ? n1 % n2 : resultado;

        System.out.print("O resultado da operacao: " + n1 + operacao + n2 + " e igual a: " + resultado);
    }
}
