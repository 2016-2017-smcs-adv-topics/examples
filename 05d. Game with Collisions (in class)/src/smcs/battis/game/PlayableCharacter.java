package smcs.battis.game;

import java.awt.*;

import objectdraw.*;

public class PlayableCharacter extends Character {

	protected KeyboardManager key;
	
	public PlayableCharacter(Image avatar, Location startingOrigin, World world, KeyboardManager key) {
		super(avatar, startingOrigin, world);
		this.key = key;
	}
	
	public void takeAStep() {
		if (key.isKeyPressed(KeyboardManager.UP)) {
			move(0, -stride);
		}
		if (key.isKeyPressed(KeyboardManager.DOWN)) {
			move(0, stride);
		}
		if (key.isKeyPressed(KeyboardManager.LEFT)) {
			move(-stride, 0);
		}
		if (key.isKeyPressed(KeyboardManager.RIGHT)) {
			move(stride, 0);
		}
	}
}
