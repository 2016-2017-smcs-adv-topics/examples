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
		// TODO manage character movement
	}
}
