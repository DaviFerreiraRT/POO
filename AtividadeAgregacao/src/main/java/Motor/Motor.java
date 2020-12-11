package Motor;

public class Motor {
	private double potencia;
	private int cilindrada;

	public Motor() {

	}

	public Motor(double potencia, int cilindrada) {
		this.potencia = potencia;
		this.cilindrada = cilindrada;
		setPotencia(potencia);
		setCilindrada(cilindrada);
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void exibir() {
		System.out.println("Potencia do veiculo: " + potencia);
		System.out.println("Cilindradas do veiculo: " + cilindrada);

	}
}
