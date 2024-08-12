package controller;

public class Ex1 {
    public static int multiplicacao(int A, int B) {
        if (B==0) {
            return 0;
        } else{
            return A + multiplicacao(A, B - 1);
        }
    }
}
