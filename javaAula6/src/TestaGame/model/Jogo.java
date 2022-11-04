package TestaGame.model;

public class Jogo extends TestaGame{
	
	private String logo;

	public Jogo(String nome, float preco, float dataFabricacao, String marca, String tipo, String logo) {
		super(nome, preco, dataFabricacao, marca, tipo);
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("\nO logo do é : " + getLogo());
	}
	
}

