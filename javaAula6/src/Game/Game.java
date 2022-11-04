package Game;

import TestaGame.model.Console;
import TestaGame.model.Jogo;

public class Game {

	public static void main(String[] args) {
		
		Console p1 = new Console("Switch", 3000.0f,2022,"Nintendo","Multiplayer","Mario");
		Jogo p2 = new Jogo("Fone de ouvido", 8000.0f,2020,"Microsoft", "eletronico","Pokemon shield");
		
		p1.visualizar();
		p2.visualizar();

	}

}

