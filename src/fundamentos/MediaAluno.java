package fundamentos;

import javax.swing.*;

public class MediaAluno {
    public static void main(String[] args) {
        int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota"));
        double soma = nota1 + nota2;
        double media = soma / 2;
        System.out.println("A media desse aluno e: " + media);
        if (media < 7) System.out.println("Aluno reprovado");
        else System.out.println("Aluno aprovado");

    }
}
