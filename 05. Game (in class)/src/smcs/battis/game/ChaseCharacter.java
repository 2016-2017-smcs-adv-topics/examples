package smcs.battis.game;

import java.awt.Image;

import objectdraw.Location;

public class ChaseCharacter extends Character implements Runnable {

	private Character target;
	
	public ChaseCharacter(
		Image avatar,
		Location startingOrigin,
		World world,
		Character target) {
		super(avatar, startingOrigin, world);
		this.target = target;
		new Thread(this).start();
	}

	@Override
	public void run() {
		double theta;
		while (true) {
			theta = Math.atan2(target.getY() - getY(), target.getX() - getX());
			move(Math.cos(theta) * stride, Math.sin(theta) * stride);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				/* do nothing */
			}
		}
	}

}
