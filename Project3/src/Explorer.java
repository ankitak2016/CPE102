import java.awt.event.KeyEvent;
/**
 * Explorer.java
 * Represents an explorer which is 
 * an occupant in the maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class Explorer extends Occupant {
	
	private String name;
	
	public Explorer(Square location, Maze maze, String name){
		super(maze,location);
		this.name = name;
		maze.lookAround(location);
	}
	
	public String name(){
		return name;
	}
	
	public void move(int key){
		Square square = super.location();
		int direction=0;
		int row = square.row();
		int col = square.col();
		//DOWN
		if(key==KeyEvent.VK_DOWN||key==KeyEvent.VK_KP_DOWN){
			direction= Square.DOWN;
			row = row +1;
		}
		//LEFT
		else if(key==KeyEvent.VK_LEFT||key==KeyEvent.VK_KP_LEFT){
			direction = Square.LEFT;
			col = col-1;
		}
		//RIGHT
		else if(key==KeyEvent.VK_RIGHT||key==KeyEvent.VK_KP_RIGHT){
			direction = Square.RIGHT;
			col = col +1;
		}
		//UP
		else if(key==KeyEvent.VK_UP||key==KeyEvent.VK_KP_UP){
			direction = Square.UP;
			row= row-1;
		}
		else{
			return;
		}
		
		if(!square.wall(direction)){
			Maze maze = super.maze();
			moveTo(maze.getSquare(row,col));
		}
	}
	
	public void moveTo(Square s){
		super.moveTo(s);
		s.enter();
		super.maze().lookAround(s);	
	}
}
