package day5;

import apcs.Window;

public class Player {

	String name = "william";
	int x = 0;
	int y = 0;
	
	Player(String name, int x, int y) { //Player constructor
		this.name = name;
		this.x = x;
		this.y = y;
		
	}

	public boolean isOnTopOfBridge(Bridge b) {
		int bx = b.xi * b.sl;
		int by = b.yi * b.sl;
		
		return false;
	}
	
//	private void write() {
//		Window.mesh.write(name + "x", x);
//		Window.mesh.write(name + "y", y);
//		
//	}
	
}
