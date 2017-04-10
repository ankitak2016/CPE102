
/**
 * DrawableSquare.java
 * Represents the image of one square in the maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableSquare extends Square implements Drawable {
	
	public void draw(){	
	}
	
	public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col){
		super(up,right, down,  left, row, col);
	}
}

