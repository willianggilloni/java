package Farmacia;

import TestaFarmacia.TestaFarmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		TestaFarmacia c1 = new TestaFarmacia("Shampoo","Liquido", 18.0f, 3.0f, 38.0f);
		
		c1.visualizar();
		
		c1.setSaldo(10.0f);
		
		c1.visualizar();
	}

}
