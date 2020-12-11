package Utility;

public final class Utilitaria {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int subtrair(int a, int b) {
        return a - b;

    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int resto(int a, int b) {
        return a % b;
    }

    public static int raiz(int a) {
        int resultado = (int) Math.sqrt(a);
        return resultado;
    }
}
