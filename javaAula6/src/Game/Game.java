package Game;

import TestaGame.model.Console;
import TestaGame.model.Jogo;
import TestaGame.model.TestaGame;

public class Game {

	public static void main(String[] args) {
		
		
		TestaGame p1 = new TestaGame("Pc Gamer", 8000.0f,2018,"Microsoft", "eletronico");
		TestaGame p2 = new TestaGame("Fone de ouvido", 8000.0f,2020,"Microsoft", "eletronico");
		
		Console p3 = new Console("Switch", 3000.0f,2022,"Nintendo","Multiplayer","Mario");
		Console p4 = new Console("ps5", 5000.0f,2022,"Playstation","Multiplayer","God of war");
		
		Jogo p5 = new Jogo("Zelda", 350.0f,2020,"Nintendo", "eletronico","Zelda BOTW");
		Jogo p6 = new Jogo("Smash brother", 350.0f,2020,"Nintendo", "eletronico","Super smash brother ultimate");
		
		p1.visualizar();
		p2.visualizar();
		p3.visualizar();
		p4.visualizar();
		p5.visualizar();
		p6.visualizar();

	}

}

