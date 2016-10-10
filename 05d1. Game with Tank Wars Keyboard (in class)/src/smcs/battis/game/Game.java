package smcs.battis.game;

import objectdraw.*;

public class Game extends WindowController {

	private World world;
	private Character protagonist, antagonist;
	private KeyboardManager key;
	
	public void begin() {
		this.setSize(500, 500);
		world = new World(
			getImage("http://cdn.pcwallart.com/images/color-gradient-background-wallpaper-2.jpg"),
			canvas
		);
		key = new KeyboardManager(canvas);
		protagonist = new PlayableCharacter(
			getImage("stick-figure.png"),
			new Location(250, 250),
			world,
			key, new KeyboardBinding()
		);
		new PlayableCharacter(
				getImage("stick-figure.png"),
				new Location(250, 350),
				world,
				key, new KeyboardBinding()
			);
		antagonist = new ChaseCharacter(
				getImage("stick-figure.png"),
				new Location(100, 100),
				world,
				protagonist
			);
		world.start();
	}
}
