package smcs.battis.game;

import java.awt.*;

import objectdraw.*;

public class Character {
	
	private VisibleImage avatar;
	
	protected double stride = 3.0; /* pixels */
	
	public Character(Image avatar, Location startingOrigin, World world) {
		this.avatar = new VisibleImage(avatar, startingOrigin, world.getCanvas());
		this.avatar.move(this.avatar.getWidth() / -2.0, this.avatar.getHeight() / -2.0);
	}
	
	/**
	 * @return The center of the avatar image
	 */
	public Location getLocation() {
		return new Location(
			avatar.getX() + avatar.getWidth() / 2.0,
			avatar.getY() + avatar.getHeight() / 2.0
		);
	}
	
	/**
	 * @return X-coordinate of the avatar origin
	 */
	public double getX() {
		return getLocation().getX();
	}
	
	/**
	 * @return Y-coordinate of the avatar origin
	 */
	public double getY() {
		return getLocation().getY();
	}
	
	/**
	 * Move the avatar
	 * @param dx Number of pixels to move in the X-direction
	 * @param dy Bumber of pixels to move in the Y-direction
	 */
	public void move(double dx, double dy) {
		this.avatar.move(dx, dy);
	}
}
