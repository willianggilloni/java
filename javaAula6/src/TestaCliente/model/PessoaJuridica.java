package TestaCliente.model;

public class PessoaJuridica extends TestaCliente{

		private String profissao;

		public PessoaJuridica(String nome, String sobrenome, float cPF, float rG, float anoDeNascimento,
				String profissao) {
			super(nome, sobrenome, cPF, rG, anoDeNascimento);
			this.profissao = profissao;
		}

		public String getProfissao() {
			return profissao;
		}

		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		
		
		public void visualizar() {
			super.visualizar();
			System.out.println("\nProfissão é : " + getProfissao());
		}
		
}