package fundamentos;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ola, digite o seu peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Agora digite sua altura: ");
        double altura = teclado.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("\n Seu imc e de %.1f.", imc);
        String resultado = imc < 18.5 ? " Abaixo do peso" : "erro";
        resultado = imc >= 18.5 && imc < 25 ? " Peso ideal" : resultado;
        resultado = imc >= 25 && imc < 30 ? " Sobrepeso" : resultado;
        resultado = imc >= 30 ? " Obesidade" : resultado;


        System.out.println(resultado);
        teclado.close();
    }
}
