package TestaCliente.model;

public class PessoaJuridica extends TestaCliente{

		private float CNPJ;
		
		

		public PessoaJuridica(String nome, String sobrenome, float cPF, float rG, float anoDeNascimento, float cNPJ) {
			super(nome, sobrenome, cPF, rG, anoDeNascimento);
			CNPJ = cNPJ;
		}

		public float getCNPJ() {
			return CNPJ;
		}

		public void setCNPJ(float cNPJ) {
			CNPJ = cNPJ;
		}

		public void visualizar() {
			super.visualizar();
			System.out.println("\nO CNPJ é : " + getCNPJ());
		}
		
}
