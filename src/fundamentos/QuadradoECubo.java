package fundamentos;

import javax.swing.*;

public class QuadradoECubo {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado: "));
        int quadrado = (int) Math.pow(numero, 2);
        int cubo = (int) Math.pow(numero, 3);
        System.out.println("\nEsse numero ao quadrado é igual a " + quadrado);
        System.out.println("Esse numero ao cubo é igual a " + cubo);


    }
}
