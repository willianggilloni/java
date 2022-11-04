package TestaCliente.model;

public class TestaCliente {
	private String nome;
	private String sobrenome;
	private float CPF;
	private float RG;
	private float anoDeNascimento;
	
	

	public TestaCliente(String nome, String sobrenome, float cPF, float rG, float anoDeNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		CPF = cPF;
		RG = rG;
		this.anoDeNascimento = anoDeNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getCPF() {
		return CPF;
	}

	public void setCPF(float cPF) {
		CPF = cPF;
	}

	public float getRG() {
		return RG;
	}

	public void setRG(float rG) {
		RG = rG;
	}

	public float getAnoDeNascimento() {
		return anoDeNascimento;
	}

	public void setAnoDeNascimento(float anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	
	public void visualizar() {
		System.out.println("\n************************************************");
		System.out.println("Dados do Usuario");
		System.out.println("\n************************************************");
		System.out.println("\nNome: " + getNome());
		System.out.println("\nSobrenome: " + getSobrenome());
		System.out.println("\nCPF: " + this.CPF);
		System.out.println("\nRG: " + this.RG);
		System.out.println("\nAno de nascimento: " + getAnoDeNascimento());

	}
}
