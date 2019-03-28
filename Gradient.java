package day1;


import apcs.Window;
public class Gradient {

	public static void main(String[] args) {
		int height = 700;
		int width = 700;


		Window.size(width,height);

		for(int i = 0; i < width; i++) {
			for(int a = 0; 15*a < height; a++) {
				Window.out.color(10, 7*i + 10, a + 100);

				Window.out.circle(width*i/15-10, 15*a, width/15);
				
			}

		}
	}

}
