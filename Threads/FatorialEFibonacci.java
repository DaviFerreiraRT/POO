import java.util.Scanner;
import java.util.ArrayList;

class Fibonacci extends Thread {
    private ArrayList<Integer> sequencia = new ArrayList<>();
    private int numero;

    public ArrayList<Integer> getSequencia() {
        return sequencia;
    }

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        if (this.numero == 1) {
            System.out.println(1);
        } else {
            sequencia.add(1);
            sequencia.add(1);
            while (numero > sequencia.get(sequencia.size() - 1)) {
                sequencia.add((sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2)));
            }
        }
    }
}

class Fatorial extends Thread {
    int numero;
    int fatorial = 1;

    public Fatorial(int numero) {
        this.numero = numero;
    }

    public int getFatorial() {
        return fatorial;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.numero; i++) {
            fatorial *= i;
        }
    }
}

public class FatorialEFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para fazer a série de fibonacci e o fatorial: ");
        int numero = 0;
        numero = sc.nextInt();

        Fibonacci fib = new Fibonacci(numero);
        fib.start();

        Fatorial fat = new Fatorial(numero);
        fat.start();

        while (fib.isAlive() || fat.isAlive()) {
        }

        ArrayList fibonacci = fib.getSequencia();

        System.out.print("Série de Fibonacci: ");
        for (int i = 0; i < fibonacci.size(); i++) {
            System.out.print(i == 0 ? fibonacci.get(i) : ", " + fibonacci.get(i));
        }

        System.out.println("\nFatorial: " + fat.getFatorial());

    }

}
