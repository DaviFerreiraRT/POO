import java.util.Scanner;

public class FatorialEFibonacci implements Runnable {
    static Scanner sc = new Scanner(System.in);

    private static int numero;
   

    @Override
    public void run() {
        System.out.println("Resultado da série de fibonacci: " + fibo(numero));
    }

    public static void main(String[] args) {
        System.out.println("Digite um valor para fazer a série de fibonacci e o fatorial: ");
        numero = sc.nextInt();
        FatorialEFibonacci Fb = new FatorialEFibonacci();
        Thread t = new Thread(Fb);
        t.start();
        System.out.println("O número " + numero + " tem o fatorial igual a: " + fatorial(numero));
    }

    public static int fatorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

}
