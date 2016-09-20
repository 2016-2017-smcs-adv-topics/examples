package smcs.battis.fancypattern;

import objectdraw.*;

public class FancyPattern extends WindowController {
	private Pattern p;
	
	public void begin() {
		p = new Pattern(100, 100, canvas);
	}
	
	public void onMouseClick(Location m) {
		p.moveTo(m);
	}
}
