import java.util.Scanner;

public class MultiploRunnable implements Runnable {
    private static int numero = 0;

    @Override
    public void run() {
        try {
            System.out.println("---Procurando divisores---");
            Thread.sleep(1000);
            for (int i = numero; i > 0; i--) {
                if (numero % i == 0) {
                    System.out.println(numero + " divido por " + i + " igual a: " + numero / i);
                }
            }

        } catch (InterruptedException e) {
            System.out.println("erro");

        }
    }

    public static void main(String[] args) {

        MultiploRunnable mr = new MultiploRunnable();
        Scanner sc = new Scanner(System.in);
        Thread m = new Thread(mr);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        m.start();
        try {
            Thread.sleep(1000);
            while (m.isAlive()) {

            }
            System.out.println("---Buscando multiplos---");

            for (int i = 0; i <= 1000; i++) {

                System.out.println("Multiplo de " + numero + " vezes " + i + " é igual a: " + numero * i);

            }
        } catch (InterruptedException e) {
            System.out.println("Erro: InterruptedException");
           
        } catch (IllegalArgumentException e  ){
            System.out.println("Erro: IllegalArgumentException");
        }
        finally{
            System.out.println("Programa encerrado!");
        }
    }
}
