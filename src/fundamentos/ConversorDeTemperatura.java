package fundamentos;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperatura = teclado.nextDouble();
        double fahrenheit = (temperatura * 9 / 5 )+ 32;
        System.out.println("\n" + temperatura + " em Fahrenheit e igual a " + fahrenheit);

        System.out.print("Agora digite uma temperatura em Fahrenheit: ");
        fahrenheit = teclado.nextDouble();
        double celsius = (fahrenheit - 32) * 9 / 5 ;
        System.out.println("\n" + fahrenheit + " em Celsius e igual a " + celsius);


        teclado.close();
    }
}
