package day5;

import apcs.Window;

public class Ground extends Tile{

	Ground(int x_index, int y_index) {
		super(x_index, y_index);
	}

	public void draw() {
		Window.out.color("forest green");
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl);

		Window.out.color("yellow green");
		Window.out.square(xi * sl + sl/2, yi * sl + sl/2, sl - 2);
		
		
	}
	
}
