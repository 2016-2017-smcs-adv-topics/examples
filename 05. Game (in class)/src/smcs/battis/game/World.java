package smcs.battis.game;

import java.awt.*;

import objectdraw.*;

public class World {
	private Character[] everybody;
	
	private DrawingCanvas canvas;
	
	public World(Image background, DrawingCanvas canvas) {
		this.canvas = canvas;
		new VisibleImage(background, 0, 0, canvas);
	}

	public DrawingCanvas getCanvas() {
		return canvas;
	}
}
