public class Veiculo {
	private String placa;
	private long chassi;
	private int ano;
	private int peso;
	private float velocMax;
	private float preco;
	private int capacidade;
	private Motor motor;
	private Peca pecas[] = new Peca[5];

	public Veiculo() {

	}

	public Veiculo(String placa, long chassi, int ano, int peso, float velocMax, float preco, int capacidade) {
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
		this.capacidade = capacidade;
	
	}	

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Peca[] getPecas() {
		return pecas;
	}

	public void setPecas(Peca[] pecas) {
		this.pecas = pecas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public long getChassi() {
		return chassi;
	}

	public void setChassi(long chassi) {
		this.chassi = chassi;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void exibir() {
		System.out.println("Placa= " + placa);
		System.out.println("Chassi= " + chassi);
		System.out.println("Ano= " + ano);
		System.out.println("Peso= " + peso + "kg");
		System.out.println("Velocidade Maxima=" + velocMax + "Km/h");
		System.out.println("Preco:R$" + preco);
		System.out.println("Capacidade= " + capacidade+" Pessoas");
		for (int i = 0; i < pecas.length; i++) {
			if (pecas[i] != null) {
				pecas[i].exibir();
			}
	
		}
		if(motor!=null) {
			motor.exibir();
		}
		else {
			System.out.println("Nenhum motor informado!");
		}

	}

	public void aumentarPreco(double aumento) {
		this.preco = (float) (preco + aumento);
	}

	public void reduzirPreco(double reducao) {
		this.preco = (float) (preco - reducao);
	}

	int totalPecas = 0;

	public void incluirPecas(Peca pecas) {
		this.pecas[totalPecas] = pecas;
		totalPecas++;
	}

	// APAGAR UM OBJETO ESPECIFICO
	public void excluirPeca(Peca peca) {
		boolean pecaExiste = false;
		int index = 0;
		for (int i = 0; i < this.pecas.length; i++) {
			if (this.pecas[i] == peca) {
				pecaExiste = true;
				index = i;
				break;
			}
		}
		if (pecaExiste) {
			for (int i = index; i < pecas.length - 1; i++) {
				pecas[i] = pecas[i + 1];
			}
			pecas[pecas.length - 1] = null;
			totalPecas--;
		}
	}

	// APAGAR O OBJETO AO TODO
	public void excluirPecas(Peca peca) {
		for (int i = 0; i < pecas.length; i++) {
			if (pecas != null && getPecas() == pecas) {
				setPecas(null);
			}
		}
	}

	public void listar() {
		for (int i = 0; i < pecas.length; i++) {
			if (pecas[i] != null) {
				pecas[i].exibir();
			}
		}
	}

	public Peca pesquisarPeca(Peca pe) {
		for (int i = 0; i < pecas.length; i++) {
			if (pecas[i] != null && pecas[i].getDescricao().equals(pe)) {
				System.out.println("Peca encontrada! \n Descric�o dada: " + pe);
				return pecas[i];
			}
		}
		System.out.println("Peca n�o encontrada! ");
		return null;
	}
}
