package fundamentos.operadores;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
    public static String coleta(String a){
        if (a.equals("s")) return "true";
        if (a.equals("n")) return "false";
        else return "e";
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Voce trabalhou terca? [s/n]");
        String resposta1 = teclado.nextLine();
        String coleta = coleta(resposta1);
        if (coleta.equals("e")) {
            System.out.println("Erro, resposta inesperada");
            System.exit(1);
        }
        boolean b1 = Boolean.parseBoolean(coleta(resposta1));

        System.out.println("E quinta, voce trabalhou? [s/n]");
        String resposta2 = teclado.nextLine();
        String coleta2 = coleta(resposta2);
        if (coleta2.equals("e")) {
            System.out.println("Erro, resposta inesperada");
            System.exit(1);
        }
        boolean b2 = Boolean.parseBoolean(coleta(resposta2));

        if (b1 || b2) {
            if (b1 && b2) {
                System.out.println("Voce comprou a tv de 50 polegadas.");
                System.out.println("Voce levou sua familia recebeu +5 de felicidade " +
                        "e perdeu -1 de saude por ter tomado sorvete");
            } else {
                System.out.println("Voce comprou a tv de 32 polegadas.");
                System.out.println("Voce levou sua familia recebeu +5 de felicidade " +
                        "e perdeu -1 de saude por ter tomado sorvete");
            }
        } else System.out.println("Voce nao comprou a televisao e sua familia nao tomou sorvete, " +
                "\nque pena :(");

        teclado.close();
    }
}