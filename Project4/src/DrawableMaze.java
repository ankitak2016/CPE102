/**
 * DrawableMaze.java
 * Represents the image of the Maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableMaze extends Maze implements Drawable{
	
	public void draw(){	
	}
	
	public DrawableMaze(DrawableSquare [][]maze, int rows, int cols){
		super(maze,rows,cols);
	}

}

