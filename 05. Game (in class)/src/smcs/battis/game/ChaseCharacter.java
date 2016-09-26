package smcs.battis.game;

import java.awt.Image;

import objectdraw.Location;

public class ChaseCharacter extends Character implements Runnable {

	public ChaseCharacter(Image avatar, Location startingOrigin, World world) {
		super(avatar, startingOrigin, world);
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (getY() > 0) {
			move(0, -stride);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				/* do nothing */
			}
		}
	}

}
