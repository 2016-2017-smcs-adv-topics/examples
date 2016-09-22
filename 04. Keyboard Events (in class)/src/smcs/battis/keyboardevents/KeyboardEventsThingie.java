package smcs.battis.keyboardevents;

import java.awt.*;
import java.awt.event.*;

import objectdraw.*;

public class KeyboardEventsThingie extends WindowController implements KeyListener {

	private FilledOval cursor;

	public final int INCREMENT = 1; // final means constant (no changing this
									// value)

	public void begin() {
		cursor = new FilledOval(100, 100, 10, 10, canvas);
		cursor.setColor(Color.RED);
		canvas.addKeyListener(this);
		canvas.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			cursor.move(0, -INCREMENT);
			break;
		case KeyEvent.VK_DOWN:
			cursor.move(0, INCREMENT);
			break;
		case KeyEvent.VK_LEFT:
			cursor.move(-INCREMENT, 0);
			break;
		case KeyEvent.VK_RIGHT:
			cursor.move(INCREMENT, 0);
			break;
		case KeyEvent.VK_G:
			cursor.setColor(Color.GREEN);
			break;
		case KeyEvent.VK_R:
		default:
			cursor.setColor(Color.RED);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
