/**
 * DrawableMonster.java
 * Represents the image of the Monster
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableMonster extends Monster implements Drawable {
	
	public void draw(){	
	}
	
	public DrawableMonster(Maze maze){
		super(maze);
	}
	
	public DrawableMonster(Maze maze, long seed){
		super(maze,seed);
	}
	
	public DrawableMonster(Maze maze, Square location){
		super(maze,location);
	}
}
