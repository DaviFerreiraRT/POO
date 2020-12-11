package Metodos;

import java.util.Scanner;

public class Questao1 {

    public static void main(String argv[]) {
        Scanner ler = new Scanner(System.in);
        String comandos = "";
        while (true) {
            System.out.print("Digite o proximo comando: ");
            String comando = ler.nextLine();
            comandos += "\n" + comando;
            System.out.println("\nComandos digitados: " + comandos);
        }
    }
}
