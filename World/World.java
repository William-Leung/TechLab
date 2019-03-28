package day5;

import apcs.Window;

public class World {

	//Tiles high splix, ublock + adblocker
	public static int tilesh = 8;	
	//Tiles wide
	public static int tilesw = 10;
	//Width of ground
	public static int groundw = 2;
	//Width of water
	public static int waterw = tilesw - groundw;
	public static int sl = 100;
	public static int windoww = tilesw * sl;
	public static int windowh = tilesh * sl;

	public static void main(String[] args) {

		Window.size(windoww, windowh);
		Ground[][] ls = new Ground[tilesh][groundw]; //left side of ground
		Ground[][] rs = new Ground[tilesh][groundw]; //right side of ground
		Water[][] ws = new Water[tilesh][waterw];

		//Set up the ground tile arrays
		for(int y = 0; y < tilesh; y++) {
			for(int x = 0; x < groundw; x++) {
				ls[y][x] = new Ground(x, y);
				rs[y][x] = new Ground(tilesw - x -1, y);
			}
		}
		
		//Setting up water tile arrays
		for(int y = 0; y < tilesh; y++) {
			for(int x = 0; x < waterw; x++) {
				ws[y][x] = new Water(x + groundw, y);
			}
		}

		//Draw the tiles
		while(true) {
			Window.frame();
			render(ls);	
			render(ws);
			render(rs);
		}

			Window.mesh.join("10.1.10.213");
				Player william = new Player("william", 560, 200);

				String[] players = {"cole", "william", "michael", "andrew", "bhuvana", "manav"};
				for (String player: players) {
					draw(player);
				}
			private static void draw(String player) {// :p
				int x = Window.mesh.read(player + "x");
				int y = Window.mesh.read(player + "y");

			}
	}

	public static void tilesetup(Tile[][] tiles) {

	}


	public static void render(Tile[][] tiles) {
		for(int y = 0; y < tiles.length; y++) {
			for(int x = 0; x < tiles[y].length; x++) {
				tiles[y][x].draw();
			}
		}
	}
}
