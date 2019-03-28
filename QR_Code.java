package day1;

import apcs.Window;

public class QR_Code {
	public static void main(String[] args) {
		int width = 400;
		int height= 400;
		int num = 40;
		int r = width/num;
		int coloring;
		double blacks = 0;
		double whites = 0;
		
				
		Window.size(width, height);
		

		for(int i = 0; r * i < width; i++) {
			
			for(int a = 0; r * a < height; a++) {
				coloring = Window.random(0,1);
				
				if(coloring == 0) {
					Window.out.color(0, 0, 0);
					blacks++;
				} else {
					Window.out.color(255, 255, 255);
					whites++;
				}
				
				/*if(Window.flipCoin()){
					Window.out.square(i * r + r/2, a * r + r/2, r);
					whites++;
				}*/
				
				
				
				
				
			}
			
		}

		blacks = 1600 - whites;
		double ratio = blacks/whites;
		
		System.out.println("The amount of blacks were " + blacks + ".");
		System.out.println("The amount of whites were " + whites + ".");
		System.out.println("The ratio of blacks to whites is " + ratio + ".");
	}
}
