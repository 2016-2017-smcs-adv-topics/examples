package smcs.battis.game;

import java.awt.*;
import java.util.*;

import objectdraw.*;

public class World implements Runnable {
	private Vector<Character> everybody;
	
	private DrawingCanvas canvas;
	
	public World(Image background, DrawingCanvas canvas) {
		this.canvas = canvas;
		new VisibleImage(background, -500, -250, canvas);
		everybody = new Vector<Character>();
	}

	public DrawingCanvas getCanvas() {
		return canvas;
	}
	
	public void addCharacter(Character c) {
		everybody.add(c);
	}
	
	public Vector<Character> getCharacters() {
		return everybody;
	}

	@Override
	public void run() {
		while (true) {
			/* tell everyone to move! */
			for (int i = 0; i < everybody.size(); i++) {
				everybody.get(i).takeAStep();
			}
			
			/* pause for a tenth of a second before doing this again! */
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		new Thread(this).start();
	}
}
