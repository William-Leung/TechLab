package day5;

public abstract class Tile {

	int xi = 0;
	int yi = 0;
	int sl = 100; //side length
	
	Tile(int x_index, int y_index) {
		this.xi = x_index;
		this.yi = y_index;
	}
	
	public abstract void draw();
		
	
	
	
}
