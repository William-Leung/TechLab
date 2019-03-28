package day4;

import apcs.Window;

public class Tester {
	public static void main(String[] args) {

		Window.size(700, 700);

		Ball b = new Ball();
		JumpBall j = new JumpBall();
		SizeBall s = new SizeBall();

		while(true) {
			
			Window.frame();
			b.live();
			s.live();
			j.live();
		}
	}
}
