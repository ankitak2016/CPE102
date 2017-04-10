/**
 * DrawableMaze.java
 * Represents the image of the Maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableMaze extends Maze implements Drawable{
	
	public void draw(){	
    pushMatrix();
    noStroke();
    fill(0);
    rect(0,0,cols()*50,rows()*50);
    popMatrix();
    
    for(int i = 0;i<rows();i++){
      for(int j = 0;j<cols();j++){
        Square square = getSquare(i,j);
        ((DrawableSquare)square).draw();
      }
   }
    
    for(int i = 0;i< getNumRandOccupants();i++){
     RandomOccupant ro = getRandomOccupant(i);
        ((Drawable)ro).draw();
    }
    ((DrawableExplorer)getExplorer()).draw();

    
	}
	
	public DrawableMaze(DrawableSquare [][]maze, int rows, int cols){
		super(maze,rows,cols);
	}

}