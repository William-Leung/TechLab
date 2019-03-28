package day4;

import apcs.Window;

public class SizeBall extends GameObject{
	
	public void draw() {
		Window.out.color("dark orange");
		Window.out.circle(x, y, r);
		
		if(Window.flipCoin()) {
			r++;
		} else {
			r--;
		}
		
		if(r >= 40) {
			r-= 10;
		}
		
		if(r <= 5) {
			r+= 10;
		}
	}
	
	public void live() {
		this.draw();
		this.move();
		this.reflect();
	}
}
