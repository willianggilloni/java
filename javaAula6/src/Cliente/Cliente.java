package Cliente;

import java.util.Scanner;

import TestaCliente.model.PessoaFisica;
import TestaCliente.model.PessoaJuridica;
import TestaCliente.model.TestaCliente;

public class Cliente {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		TestaCliente c1 = new TestaCliente("willian", "gilloni",88888888808.0f,450088889,1989);
		TestaCliente c2 = new TestaCliente("Luiz", "gilloni",88888888808.0f,450088889,1989);
		
		
		PessoaFisica c3 = new PessoaFisica("Joao", "Carlos",88888888808.0f,450088889,1989,8888888);
		PessoaFisica c4 = new PessoaFisica("Marcos", "Errada",88888888808.0f,450088889,1989,8888888);
		
		PessoaJuridica c5 = new PessoaJuridica("Yuri", "SuperDev",88888888808.0f,450088889,1989,8888888);
		PessoaJuridica c6 = new PessoaJuridica("Rafa", "SuperDev",88888888808.0f,450088889,1989,8888888);
		
		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		c4.visualizar();
		c5.visualizar();
		c6.visualizar();
	}

}
