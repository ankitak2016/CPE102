/**
 * DrawableMonster.java
 * Represents the image of the Monster
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableMonster extends Monster implements Drawable {
	
	public void draw(){	
       
       if(location().inView()){
       pushMatrix();
       translate((int)(location().x()+25), (int)(location().y()+25));
        
       noStroke();
      
       // head
       fill(0,128,255);
       ellipse(0, 0, 40, 40);
        
       // eyes
       fill(255);
       ellipse(-5,-3,4,4);
       ellipse(5,-3,4,4);
       fill(0);
       ellipse(-5, -3, 2, 2);
       ellipse(5, -3, 2, 2);

        
       //nose
       fill(0);
      ellipse(0, 4, 3, 3);
        
       //teeth
       pushMatrix();
       fill(255);
       rotate(PI);
       triangle(-7, -8, -5, -13, -3, -8);
       triangle(-3,-8,0,-13,3,-8);
       triangle(7, -8, 5, -13, 3, -8);
       popMatrix();
        
       // eyebrows
       fill(0);
       ellipse(-10, -10, 10, 4);
       ellipse(10, -10, 10, 4);
       popMatrix();
       
       }
        
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