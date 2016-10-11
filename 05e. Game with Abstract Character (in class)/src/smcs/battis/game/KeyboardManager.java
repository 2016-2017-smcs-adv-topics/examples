package smcs.battis.game;

import java.awt.event.*;
import objectdraw.*;

public class KeyboardManager implements KeyListener {

	private boolean[] keysPressed;
	
	/* nota bene: we could _totes_ do this with an enumerated type */
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;

	public KeyboardManager(DrawingCanvas canvas) {
		keysPressed = new boolean[4];
		canvas.addKeyListener(this);
		canvas.requestFocus();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			keysPressed[UP] = true;
			break;
		case KeyEvent.VK_DOWN:
			keysPressed[DOWN] = true;
			break;
		case KeyEvent.VK_LEFT:
			keysPressed[LEFT] = true;
			break;
		case KeyEvent.VK_RIGHT:
			keysPressed[RIGHT] = true;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			keysPressed[UP] = false;
			break;
		case KeyEvent.VK_DOWN:
			keysPressed[DOWN] = false;
			break;
		case KeyEvent.VK_LEFT:
			keysPressed[LEFT] = false;
			break;
		case KeyEvent.VK_RIGHT:
			keysPressed[RIGHT] = false;
			break;
		}
	}

	public boolean isKeyPressed(int keyCode) {
		if (keyCode >= 0 && keyCode < keysPressed.length) {
			return keysPressed[keyCode];
		}
		return false;
	}
}
