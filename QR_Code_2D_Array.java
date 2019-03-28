package day2;


import apcs.Window;

public class QR_Code_2D_Array {
	
	public static void main(String[] args) {
		int width = 800;
		int height= 800;
		int num = 80;
		int r = width/num;
		int random = 0;
		boolean color = true;

		Window.size(width, height);
		Window.out.background(0, 0, 0);
		
		
		//Array initialization
		boolean[][] my_nums = new boolean [80][80];

		for(int j = 0; j < my_nums.length; j++) {
			for(int k = 0; k < my_nums.length; k++) {
				//Assigns values of array to either true or false
				random = Window.random(0, 1);
				if(random == 0) {
					color = true;
				} else {
					color = false;
				}
				my_nums[j][k] = color;
			}
		}

		//Drawing the squares
		//true = white
		
		Window.out.color(255, 255, 255);

		while(true) {
			Window.frame();
			for(int i = 0; r * i < width; i++) {
				
				for(int a = 0; r * a < height; a++) {
					
					if(my_nums[i][a] == true){
						Window.out.square(i * r + r/2, a * r + r/2, r);
					}
					
				}
			}
		}
	}
	
	
}
