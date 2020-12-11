package Metodos;

import java.util.Scanner;

public class Questao3 {

    public static double somarArray(double x[]) {
        double soma = 0;

        for (int i = 0; i < x.length; i++) {
            soma += x[i];
        }
        return soma / x.length;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int qnt = ler.nextInt();
        double v[] = new double[qnt];

        System.out.println("Digite os valores: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = ler.nextDouble();
        }
        System.out.println("A media é: " + somarArray(v));
    }
}
