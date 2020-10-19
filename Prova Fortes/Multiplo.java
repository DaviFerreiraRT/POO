import java.util.*;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 0 ; i<=n;i++){
            if(n%3==0){
                System.out.println("FIZZ");
                break;
            }
            if(n%5==0){
            System.out.println("BUZZ");
            break;
            
            }

            if(n%3==0 && n%5==0){
                System.out.println("FIZZBUZZ");
                break;
               
            }
        }
    }
    
}
