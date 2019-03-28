package day3;

import apcs.Window;

public class Ball {
	
	int r = 10;
	int x = Window.random(r, Window.width() - r);
	int y = Window.random(r, Window.height() - r);
	
	int dx = Window.random(-10, 10);
	int dy = Window.random(-10, 10);
	
	int rcolor = Window.random(0, 255);
	int gcolor = Window.random(0, 255);
	int bcolor = Window.random(0, 255);
	
	public void drawBall() {
		//Outline
		Window.out.color("black");
		Window.out.circle(x, y, r);
		
		//Window.out.randomColor();
		Window.out.color(rcolor, gcolor, bcolor);
		Window.out.circle(x, y, r - 1);
		
	}
	
	public void moveBall() {
		x += dx;
		y += dy;
	}
	
	public void bounceBall() {
		if(x > Window.width() - r || x < r) {
			dx = -dx;
		}
		
		if(y > Window.height() - r || y < r) {
			dy = -dy;
		}
	}
	
	public void live() {
		this.drawBall();
		this.moveBall();
		this.bounceBall();
	}
	
}
