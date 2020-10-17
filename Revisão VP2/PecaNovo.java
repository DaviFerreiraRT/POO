public class PecaNovo implements Exibivel {
	private int codigo;
	private String descricao;
	private String marca;

	static int numPecas = 0;

	public PecaNovo() {

	}

	public PecaNovo(int codigo, String descricao, String marca) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;
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
		System.out.println("Codigo da peca: " + getCodigo());
		System.out.println("Descricao da peca: " + getDescricao());
		System.out.println("Marca da peca:" + getMarca());
	}
	
}
