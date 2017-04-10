/**
 * DrawableSquare.java
 * Represents the image of one square in the maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class DrawableSquare extends Square implements Drawable {
	
	public void draw(){	
    if(seen()==false){
      return;
    }
    else{
         pushMatrix();
         translate(x(),y()); 
         noStroke();
         if(this.inView()){
     
            fill(160,160,160);
            rect(0,0,50,50);
         }
        if(this.seen()&&!this.inView()){
            fill(96,96,96);
            rect(0,0,50,50);
        }
        stroke(51,51,255);
         if(wall(0)){
        line(0,0,50,0);
      }
      if(wall(1)){
        line(50,0,50,50);
      }
      if(wall(2)){
        line(50,50,0,50);
      }
      if(wall(3)){
        line(0,0,0,50);
      }
      popMatrix();
    }


      
	}
	
	public DrawableSquare(boolean up, boolean right, boolean down, boolean left, int row, int col){
		super(up,right, down,  left, row, col);
	}
}