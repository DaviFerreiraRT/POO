package Peca;

public class Peca {
	private int codigo;
	private String descricao;
	private String marca;

	public Peca() {

	}

	public Peca(int codigo, String descricao, String marca) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.marca = marca;

		setCodigo(codigo);
		setMarca(marca);
		setDescricao(descricao);
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
		System.out.println("Codigo da peca: "+codigo);
		System.out.println("Descricao da peca: "+descricao);
		System.out.println("Marca da peca:" +marca);
	}
}
