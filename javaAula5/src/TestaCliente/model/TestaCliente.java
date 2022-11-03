package TestaCliente.model;

import Cliente.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("willian", "gilloni",88888888808.0f,450088889,1989);
		Cliente c2 = new Cliente("Luiz", "gilloni",88888888808.0f,450088889,1989);
		
		c1.visualizar();
		c2.visualizar();
		
		


	}

}
