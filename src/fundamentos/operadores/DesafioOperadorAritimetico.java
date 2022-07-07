package fundamentos.operadores;

public class DesafioOperadorAritimetico {
    public static void main(String[] args) {
//      parte 1
        double operacao1 = Math.pow(6 * (3 + 2), 2);
        double operacao2 = 3 * 2;
        double resultado1 = operacao1 / operacao2;

//      parte 2
        double operacao3 = (1 - 5) * (2 - 7);
        double resultado2 = Math.pow((operacao3 / 2), 2);

//      parte 3
        double operacao4 = Math.pow(resultado1 - resultado2, 3);
        double operacao5 = Math.pow(10,3);
        double resultadofinal = operacao4 / operacao5;

        System.out.printf("O resultado dessa expressao e: %.0f",resultadofinal);
    }
}
