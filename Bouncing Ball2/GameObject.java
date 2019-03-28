package day4;

import apcs.Window;

public abstract class GameObject {

	protected int x = Window.random(100, 400);
	protected int y = Window.random(100, 400);
	protected int dx = 10;
	protected int dy = 10;
	protected int r = 20;
	
	public void move(){
		x += dx;
		y += dy;
	}
	
	public abstract void draw(); // you must have a draw method
	
	public void reflect() {
		if(x > Window.width() || x < 0) {
			dx = -dx;
		}
		if(y > Window.height() || y < 0) {
			dy = -dy;
		}
	}

}
