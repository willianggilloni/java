package Game;

import TestaGame.model.TestandoGame;

public class Game {

	public static void main(String[] args) {
		
		TestandoGame p1 = new TestandoGame("Pc Gamer", 8000.0f,2018,"Microsoft", "eletronico");
		TestandoGame p2 = new TestandoGame("Fone de ouvido", 8000.0f,2020,"Microsoft", "eletronico");
		
		p1.visualizar();
		p2.visualizar();

	}

}

