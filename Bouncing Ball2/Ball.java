package day4;

import apcs.Window;

public class Ball extends GameObject{

	public void draw() {
		Window.out.color("powder blue");
		Window.out.circle(x, y, r);
	}
	
	public void live() {
		this.draw();
		this.move();
		this.reflect();
	}
}
