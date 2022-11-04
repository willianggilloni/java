package Farmacia;

import TestaFarmacia.model.TestaFarmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		TestaFarmacia c1 = new TestaFarmacia("Shampoo","Liquido", 18.0f, 3.0f, 38.0f);
		TestaFarmacia c2 = new TestaFarmacia("Viagra","Comprimido", 30.0f, 3.0f, 38.0f);
		
		c1.visualizar();
	
		c2.visualizar();
	}

}
