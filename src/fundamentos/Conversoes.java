package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Conversoes {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "us"));
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro salario: ");
        String salario1 = teclado.nextLine().replace(",", ".");
        System.out.println(salario1);

        System.out.print("\nDigite o segundo salario: ");
        String salario2 = teclado.nextLine().replace(",", ".");
        System.out.println(salario2);

        System.out.print("\nDigite o terceiro salario: ");
        String salario3 = teclado.nextLine().replace(",", ".");
        System.out.println(salario3);

        double conversao1 = Double.parseDouble(salario1);
        double conversao2 = Double.parseDouble(salario2);
        double conversao3 = Double.parseDouble(salario3);
        double soma = conversao1 + conversao2 + conversao3;
        double media = soma / 3;

        System.out.println("A media desses salarios e: " + media);
        teclado.close();
    }
}
