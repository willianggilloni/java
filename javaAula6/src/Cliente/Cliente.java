package Cliente;

import java.util.Scanner;

import TestaCliente.model.PessoaFisica;
import TestaCliente.model.PessoaJuridica;
import TestaCliente.model.TestaCliente;

public class Cliente {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PessoaFisica c1 = new PessoaFisica("willian", "gilloni",88888888808.0f,450088889,1989,"Desenvolvedor");
		PessoaJuridica c2 = new PessoaJuridica("Luiz", "gilloni",88888888808.0f,450088889,1989,"Juiz");
		
		c1.visualizar();
		c2.visualizar();
		
	}

}
