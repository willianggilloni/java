package TestaFarmacia.model;

public class Perfumaria extends TestaFarmacia{

	
	private String perfume;

	


	public Perfumaria(String nome, String tipo, float preco, float d, float saldo, String perfume) {
		super(nome, tipo, preco, d, saldo);
		this.perfume = perfume;
	}




	public String getPerfume() {
		return perfume;
	}




	public void setPerfume(String perfume) {
		this.perfume = perfume;
	}




	public void visualizar() {
		super.visualizar();
		System.out.println("\nO perfume é : " + getPerfume());
	}
	
}
