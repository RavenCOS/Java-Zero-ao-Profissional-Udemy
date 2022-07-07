package fundamentos;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*Tipos numéricos*/
        Byte b = 127;
        System.out.println(b.byteValue());

        Short s = 2022;
        String sho = s.toString();
        System.out.println("O ano e: " + sho);

        Integer i = Integer.parseInt("1234");
        System.out.println(i);
        System.out.println("Digite o proximo numero: ");

        Integer i2 = Integer.parseInt(teclado.next());
        System.out.println(i2);

        Long l = 1_000_000_000L;
        System.out.println(l / 3);

        Float f = 05.11F / 3.594F;
        System.out.printf("o numero real %f e infinito? %b\n", f,Float.isInfinite(f));

        Double d = f / 599.824;
        System.out.printf("E agora? O numero %f é infinito? %b\n", d, Double.isInfinite(d));
        System.out.println("Eita que tá dificil");

        /*Char e String*/
        Character c = 'A';
        String ss = " de Abacate";
        System.out.println(c + ss);

        /*Boolean*/
        Boolean bo = Boolean.parseBoolean("False");
        System.out.println(bo);
        bo = true;
        System.out.println(bo.toString().toUpperCase());

        teclado.close();
    }
}
