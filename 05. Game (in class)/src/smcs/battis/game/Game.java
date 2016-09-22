package smcs.battis.game;

import objectdraw.*;

public class Game extends WindowController {

	private World world;
	private Character me;
	
	public void begin() {
		world = new World(canvas);
		me = new Character();
	}
}
