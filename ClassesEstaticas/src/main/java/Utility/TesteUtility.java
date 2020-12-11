package Utility;
import java.util.Scanner;

public class TesteUtility {

    public static void main(String[] args) {
        int resultado = 0, n1 = 0, n2 = 0;
        System.out.println("Digite uma opçao\n 1-Somar\n 2-Subtrair\n 3-Multiplicar\n 4-Dividir");
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        opcao = scan.nextInt();
        while (opcao != 9) {

            if (opcao > 4 || opcao < 1) {
                System.out.println("Opçao invalida");
            } else {
                System.out.println("Digite o primeiro valor");
                n1 = scan.nextInt();
                System.out.println("Digite o segundo valor");
                n2 = scan.nextInt();

                if (opcao == 1) {
                    resultado = Utilitaria.soma(n1, n2);
                } else if (opcao == 2) {
                    resultado = Utilitaria.subtrair(n1, n2);
                } else if (opcao == 3) {
                    resultado = Utilitaria.multiplicacao(n1, n2);
                } else if (opcao == 4) {
                    resultado = Utilitaria.dividir(n1, n2);
                }

                System.out.println("Resultado da operação é:" + resultado);
            }
            System.out.println("Digite uma opçao\n 1-Somar\n 2-Subtrair\n 3-Multiplicar\n 4-Dividir");
            opcao = scan.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
