package TestaCliente.model;

public class PessoaFisica extends TestaCliente {
	
	private float CPF;

	public PessoaFisica(String nome, String sobrenome, float cPF, float rG, float anoDeNascimento, float cPF2) {
		super(nome, sobrenome, cPF, rG, anoDeNascimento);
		CPF = cPF2;
	}

	public float getCPF() {
		return CPF;
	}


	public void setCPF(float cPF) {
		CPF = cPF;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("\nO CPF é : " + getCPF());
	}
	

	
}
