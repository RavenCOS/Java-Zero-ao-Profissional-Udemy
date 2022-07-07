package fundamentos.operadores;

import javax.swing.*;

public class ParOuImpar {
    public static void main(String[] args) {
        String painel = JOptionPane.showInputDialog("Digite o numero desejado: ");
        double numero = Double.parseDouble(painel);
        if (numero % 2 == 0) {
            System.out.printf("O numero %.0f e par", numero);
        } else if (numero % 2 == 1) {
            System.out.printf("O numero %.0f e impar", numero);
        } else System.out.println("erro");
    }
}
