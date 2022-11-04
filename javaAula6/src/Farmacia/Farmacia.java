package Farmacia;

import TestaFarmacia.model.Medicamento;
import TestaFarmacia.model.Perfumaria;
import TestaFarmacia.model.TestaFarmacia;

public class Farmacia {

	public static void main(String[] args) {
		
		TestaFarmacia c1 = new TestaFarmacia("Shampoo","Liquido", 18.0f, 3.0f, 38.0f);
		TestaFarmacia c2 = new TestaFarmacia("Viagra","Comprimido", 30.0f, 3.0f, 38.0f);
		
		Medicamento c3 = new Medicamento("Shampoo","Liquido", 18.0f, 3.0f, 38.0f,"Rivotril");
		Medicamento c4 = new Medicamento("Shampoo","Liquido", 18.0f, 3.0f, 38.0f,"Roacutan");
		
		Perfumaria c5 = new Perfumaria("Viagra","Comprimido", 30.0f, 3.0f, 38.0f,"Animalia");
		Perfumaria c6 = new Perfumaria("Viagra","Comprimido", 30.0f, 3.0f, 38.0f,"Ferrari");
		
		c1.visualizar();
		c2.visualizar();
		c3.visualizar();
		c4.visualizar();
		c5.visualizar();
		c6.visualizar();
	}

}
