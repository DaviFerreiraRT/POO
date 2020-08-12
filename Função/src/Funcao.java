import java.util.Scanner;
public class Funcao {
	public static float z(float a, float b,float c) {
		float multi;
		return multi=(a+b*2+c*3)/6;
	};
	public static void chama() {
		Scanner num = new Scanner(System.in);
		Scanner ler=new Scanner(System.in);
		float i;
		float o;
		float a;
		System.out.println("Digite o valor de sua VP1: ");
		i = num.nextFloat();
		System.out.println("Digite o valor de sua VP2: ");
		o = num.nextFloat();
		System.out.println("Digite o valor de sua VF: ");
		a = num.nextFloat();
		float resultado=z(i,o,a);
		System.out.println("A sua media foi: "+resultado);
		if(resultado>=5.5) {
			System.out.println("Voce foi Aprovado");
		}
		else {
			System.out.println("Voce foi Reprovado");
		}
	}
	public static void main(String[] args) {
		chama();
	}
};