import java.util.Scanner;

public class MultiploThread extends Thread {
    private static int numero;
    static Scanner sc = new Scanner(System.in);

    @Override
    public void run() {

        try {
            System.out.println("---Procurando divisores---");
            Thread.sleep(1000);
            for (int i = numero; i > 0; i--) {
                if (numero % i == 0) {
                    System.out.println(numero + " divido " + i + " igual a " + numero / i);
                }
            }

        } catch (InterruptedException e) {
            System.out.println("erro");

        }
    }

    public static void main(String[] args) {
        MultiploThread t = new MultiploThread();
        System.out.print("Digite um numero para buscar os multiplos e divisores: ");
        numero = sc.nextInt();
        t.start();

        while (t.isAlive()) {
            // Esperando a thread de divisão finalizar a execução
        }

        for (int i = 1; i <= 10; i++) {
            if (numero % i == 0) {
                System.out.println("Multiplo de " + numero + " vezes " + i + " é igual a: " + numero * i);
            }
        }

    }
}