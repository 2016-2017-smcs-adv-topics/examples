package smcs.battis.pattern;

import objectdraw.*;

public class Pattern extends WindowController {
	public void begin() {
		for (int row = 0; row < 10; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < 9; col++) {
					new FilledOval(20 * col + 10, 20 * row, 15, 15, canvas);
				}
			} else {
				for (int col = 0; col < 10; col++) {
					new FilledOval(20 * col, 20 * row, 15, 15, canvas);
				}
			}
		}
	}

}
