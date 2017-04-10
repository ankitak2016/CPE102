
/**
 * DrawableTreasure.java
 * Represents the image of the treasure
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableTreasure extends Treasure implements Drawable {
	
	public void draw(){
	}
	
	public DrawableTreasure(Maze maze){
		super(maze);
	}
	
	public DrawableTreasure(Maze maze, long seed){
		super(maze,seed);
	}
	
	public DrawableTreasure(Maze maze, Square location){
		super(maze,location);	
	}
}

