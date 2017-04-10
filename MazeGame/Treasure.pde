/**
 * Treasure.java
 * Represents a treasure that is a 
 * random occupant in the maze
 * @author Ankita Koratkar CPE 102-01
 * @version 02/21/2017
 */
public class Treasure extends RandomOccupant {
	
	private boolean found;
	
	public Treasure(Maze maze){
		super(maze);
		found = false;
		Square square = super.location();
		square.setTreasure(this);
	}
	
	public Treasure(Maze maze, long seed){
		super(maze,seed);
		found = false;
		Square square = super.location();
		square.setTreasure(this);		
	}
	
	public Treasure(Maze maze, Square location){
		super(maze,location);
		found = false;
		Square square = super.location();
		square.setTreasure(this);		
	}
	
	public boolean found(){
		return found;
	}
	
	public void setFound(){
		found = true;
	}
	
	@Override
	public void move(){
		
	}
}
