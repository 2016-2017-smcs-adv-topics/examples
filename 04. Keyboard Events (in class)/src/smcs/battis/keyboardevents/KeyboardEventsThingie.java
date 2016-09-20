package smcs.battis.keyboardevents;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objectdraw.*;

public class KeyboardEventsThingie extends WindowController implements KeyListener {
	
	public void begin() {
		canvas.addKeyListener(this);
		canvas.requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.print(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
