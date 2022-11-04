package TestaFarmacia.model;

public class Medicamento extends TestaFarmacia{

		private String remedio;

		public Medicamento(String nome, String tipo, float preco, float d, float saldo, String remedio) {
			super(nome, tipo, preco, d, saldo);
			this.remedio = remedio;
		}

		public String getRemedio() {
			return remedio;
		}

		public void setRemedio(String remedio) {
			this.remedio = remedio;
		}
		
		public void visualizar() {
			super.visualizar();
			System.out.println("\nMedicamento é : " + getRemedio());
		}
		
}
