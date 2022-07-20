package fundamentos.operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double media = 7.8;
        String resultadoParcial = media >= 5.0 ? "Aluno em recuperacao" : "Aluno Reprovado";
        String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
        System.out.println(resultadoFinal);
    }
}
