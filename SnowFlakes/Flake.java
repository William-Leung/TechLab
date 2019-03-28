package fallingSnow;

import apcs.Window;

public class Flake {
	
	int flakex = Window.random(0, Window.width()); //x position of flake (center)
	int flakey = Window.random(-4000, -30); // y position of flake (center)
	int flakedx = 0; // horizontal speed of flake
	int flakedy = 3; // vertical speed of flake

	public void drawFlake() {
		Window.out.color(Window.random(0, 255), Window.random(0, 255), Window.random(0, 255));
		Window.out.circle(flakex, flakey, 2);
	}
	
	public void moveFlake() {
		
		flakey += flakedy;
		flakedx = Window.random(-4, 3);
		flakex += flakedx;
		
	}
	
}
