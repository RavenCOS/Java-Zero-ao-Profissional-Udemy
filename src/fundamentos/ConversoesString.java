package fundamentos;

import javax.swing.*;

public class ConversoesString {
    public static void main(String[] args) {
        String painel = JOptionPane.showInputDialog("Digite um numero:");
        Integer num = Integer.parseInt(painel);
        System.out.printf("O valor do numero %d em byte e: %d\n", num, num.byteValue());

        String painel1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String painel2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        System.out.println(painel1 + painel2);
        System.out.println(Integer.parseInt(painel1) + Integer.parseInt(painel2));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero de novo"));
        System.out.println(Integer.parseInt(painel1) + num2);

    }
}
