/**
 * DrawableExplorer.java
 * Represents the image of the Explorer
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableExplorer extends Explorer implements Drawable{
	
	public DrawableExplorer(Square location, Maze maze, String name){
		super(location,maze,name);	
	}
	
	public void draw(){	
       pushMatrix();
       translate((int)(location().x()+25), (int)(location().y()+25));
       noStroke();
       fill(255,255,0);
       arc(0, 0, 40, 40, QUARTER_PI, PI+3*QUARTER_PI, PIE);
       fill(0);
       ellipse(0,-10,2,2);
       popMatrix();
       

	}

}