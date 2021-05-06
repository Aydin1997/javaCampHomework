package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Yeni Oyun Eklendi: "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi: "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi: "+game.getGameName());
		
	}

}
