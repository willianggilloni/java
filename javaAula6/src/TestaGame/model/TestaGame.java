package TestaGame.model;

public class TestaGame {
	
	private String nome;
	private float preco;
	private float dataFabricacao;
	private String marca;
	private String tipo;
	
	public TestaGame(String nome, float preco, float dataFabricacao, String marca, String tipo) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.dataFabricacao = dataFabricacao;
		this.marca = marca;
		this.tipo = tipo;
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public float getDataFabricacao() {
		return dataFabricacao;
	}



	public void setDataFabricacao(float dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void visualizar() {
		System.out.println("\n************************************************");
		System.out.println("Dados do produto");
		System.out.println("\n************************************************");
		System.out.println("\nNome do produto: " + getNome());
		System.out.println("\nPreco Do Produto: " + this.preco);
		System.out.println("\nData de fabricacao: " + this.dataFabricacao);
		System.out.println("\nMarca do produto: " + this.marca);
		System.out.println("\nTipo do produto: " + this.tipo);
	}
}
