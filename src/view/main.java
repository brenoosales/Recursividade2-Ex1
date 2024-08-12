package view;

import controller.Ex1;

public class main {
    public static void main(String[] args) {
        int A = 8, B = 5;

        int resultadoMultiplicacao = Ex1.multiplicacao(A, B);
        System.out.printf("%d * %d = %d", A, B, resultadoMultiplicacao);
    }
}
