public class testeProva {

private double n1,n2,n3;
public testeProva(double n1, double n2, double n3){
	this.n1=n1;
	this.n2=n2;
	this.n3=n3;
}

public double getN1() {
	return n1;
}
public double getN2() {
	return n2;
}

public double getN3() {
	return n3;
}

public void setN1(double n1) {
	this.n1 = n1;
}
public void setN2(double n2) {
	this.n2 = n2;
}
public void setN3(double n3) {
	this.n3 = n3;
}
double resultado;
public void calculaMedia(){

	resultado=(n1+n2+n3)/3;;
	
}
public void exibir(){
	System.out.println("Nota 1: "+n1);
	System.out.println("Nota 2: "+n2);
	System.out.println("Nota 3: "+n3);
	System.out.println("MEDIA FINAL FOI : "+resultado);
}
}
