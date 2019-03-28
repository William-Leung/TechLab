package fallingSnow;

import apcs.Window;

public class Enviroment {
	
	public static void main(String[] args) {
		
		Window.size(600, 700);
		

		Flake[] flakearr = new Flake[4000];
		
		for(int count = 0; count < flakearr.length; count++) {
			
			flakearr[count] = new Flake();
			
		}
		
		while(true) {
			
			Window.frame();
			
			//Window.out.background("powder blue");
			
			for(Flake snow: flakearr) {
				snow.drawFlake();
				snow.moveFlake();
			}
			
			
			
		}
		
	}
	
}
