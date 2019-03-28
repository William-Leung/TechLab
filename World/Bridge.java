package day5;

import apcs.Window;

public class Bridge extends Tile {

	Bridge(int x_index, int y_index) {
		super(x_index, y_index);
	}

	public void draw() {
		Window.out.color(139,69,19);
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl);

		Window.out.color(222,184,135);
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl - 2);
	}

}
