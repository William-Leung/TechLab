package day4;

import apcs.Window;

public class JumpBall extends GameObject {


	public void draw() {
		Window.out.color("green yellow");
		r = 15;
		Window.out.circle(x, y, r);
	}

	public void jumpMove() {
		int count = 0;
		boolean counter = false;
		if(counter == true) {
			if(Window.flipCoin()) {
				dx++;
				dy--;
			} else {
				dx--;
				dy++;
			}
		}

		if(dx >= 30) {
			dx = 20;
		}
		if(dx <= 5) {
			dx = 15;
		}
		if(dy >= 30) {
			dy = 20;
		}
		if(dy <= 5) {
			dy = 15;
		}
		
		count++;
		if(count == 7) {
			count = 0;
			counter = true;
		}
		
		
		this.move();
	}

	public void live() {
		this.draw();
		this.jumpMove();
		this.reflect();
	}

}
