package fundamentos;


public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = -13;

        int delta = (int) Math.pow(b,2) - (4 * a * c);
        System.out.println(delta);

        double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
        double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println(raiz1 + " " + raiz2);
    }
}
