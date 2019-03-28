package day3;

import apcs.Window;

public class Main {
	public static void main(String[] args) {

		Window.size(1000, 1000);

		//Object array initialization

		Ball[] arr = new Ball[800];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Ball();
		}
		
		while(true) {
			Window.frame(0);
			Window.out.background("wheat");
			
			for(Ball b: arr) {  //For every ball in the arr array, exist
				b.live();
			}
			
			Window.sleep(5);
			
		}

	}
}
