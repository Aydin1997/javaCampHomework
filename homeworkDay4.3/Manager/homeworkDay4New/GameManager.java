package homeworkDay4New;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getId()+" Numaral� Oyun Sisteme Eklendi: "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId()+" Numaral� Oyun Sistemden Silindi: "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId()+" Numaral� Oyun G�ncellendi: "+game.getName());
		
	}
	
}
