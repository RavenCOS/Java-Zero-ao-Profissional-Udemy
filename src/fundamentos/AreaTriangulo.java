package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a base desse triangulo: ");
        double base = teclado.nextDouble();
        System.out.print("\nAgora digite a altura: ");
        double altura = teclado.nextDouble();
        double area = (base * altura) / 2;
            System.out.println("A area desse triangulo e de " + area);
        teclado.close();
    }
}
