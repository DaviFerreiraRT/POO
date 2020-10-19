import java.util.Scanner;

public class Triangulo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
   
    if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
      System.out.println("Não é um triangulo");
    } else {
      if (a == b && b == c) {
        System.out.println("Equilátero");
      } else if (a == b || b == c || c == a) {
        System.out.println("Isósceles");
      } else {
        System.out.println("Escaleno");
      }
    }
  }
}

