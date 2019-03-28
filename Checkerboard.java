package day1;

import apcs.Window;

public class Checkerboard {
	public static void main(String[]args) {
		
		int length = 800;
		int counter = 0;
		
		Window.size(length, length);
		
		//counter 0 = black counter 1 = white
		
		for(int i = 0; 100 * i <= length; i++) {
			
			for(int a = 0; 100 * a <= length; a++) {
				
				if(counter == 0) {
					counter = 1;
					Window.out.color(255,255,255);
				} else {
					counter = 0;
					Window.out.color(0,0,0);
				}
				
				Window.out.square(i * length/8 - 50 , a * length/8 + 50, length/8);
			}
		}
	}
}
