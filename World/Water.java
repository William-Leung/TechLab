package day5;

import apcs.Window;

public class Water extends Tile{
	
	Water(int x_index, int y_index) {
		super(x_index, y_index);
	}

	public void draw() {
		Window.out.color("medium blue");
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl);

		Window.out.color(64, 164, 223);
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl - 2);
		
		
	}
}
