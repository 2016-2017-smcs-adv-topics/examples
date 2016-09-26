package smcs.battis.game;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class PlayableCharacter extends Character implements KeyListener {

	public PlayableCharacter(Image avatar, Location startingOrigin, World world) {
		super(avatar, startingOrigin, world);
		world.getCanvas().addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				move(0, -stride);
				break;
			case KeyEvent.VK_DOWN:
				move(0, stride);
				break;
			case KeyEvent.VK_LEFT:
				move(-stride, 0);
				break;
			case KeyEvent.VK_RIGHT:
				move(stride, 0);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
