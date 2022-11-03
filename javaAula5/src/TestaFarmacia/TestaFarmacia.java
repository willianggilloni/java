package TestaFarmacia;

public class TestaFarmacia {

	private String nome;
	private String tipo;
	private float preco;
	private float desconto;
	private float saldo;
	
	
	
	public TestaFarmacia(String nome, String tipo, float preco, float d, float saldo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.desconto = d;
		this.saldo = saldo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}



	public float getDesconto() {
		return desconto;
	}



	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public void visualizar() {
		System.out.println("\n************************************************");
		System.out.println("Dados da compra Farmacia");
		System.out.println("\n************************************************");
		System.out.println("\nNome do produto: " + getNome());
		System.out.println("\nNumero da agencia: " + getTipo());
		System.out.println("\nTipo da conta: " + this.preco);
		System.out.println("\nTitular da conta: " + this.desconto);
		System.out.println("\nSaldo da conta: " + this.saldo);
	}
}

