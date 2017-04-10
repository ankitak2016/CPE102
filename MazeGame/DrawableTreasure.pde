/**
 * DrawableTreasure.java
 * Represents the image of the treasure
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableTreasure extends Treasure implements Drawable {
	
	public void draw(){

    
    if(location().seen()){
    if(!found()){
         pushMatrix();
    translate((int)(location().x()+25),(int)(location().y()+25));
    noStroke();
      fill(255,128,0);
    ellipse(0,0,40,40);
    popMatrix();
    }
    }
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