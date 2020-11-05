public class PecaNovo implements Exibivel {
	private int codigo;
	private String descricao;
	private String marca;

	public static int numPecas = 0;

	public PecaNovo() {
		numPecas++;
	}

	public PecaNovo(int codigo, String descricao, String marca) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
		numPecas++;
	}

	public static int getNumPecas() {
		return numPecas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void exibir() {
		System.out.println("Codigo da peca: " + this.codigo);
		System.out.println("Descricao da peca: " + this.descricao);
		System.out.println("Marca da peca:" + this.marca);
	}

	public void exibir(String texto) {
		System.out.println(texto);
		this.exibir();
	}
}
