package Metodos;

import java.util.Scanner;

public class Questao5 {

    public static boolean testarPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero para verificar se eh primo:");
        int numero = scan.nextInt();
        while (numero > 0) {
            if (testarPrimo(numero)) {
                System.out.println("O numero eh  primo");
            } else {
                System.out.println("O numero nao eh primo");
            }
            System.out.print("Digite o numero para verificar se eh primo:");
            numero = scan.nextInt();
        }
        System.out.println("Programa se auto destruindo em 3...2...1");
    }
}
