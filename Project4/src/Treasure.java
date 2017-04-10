import java.util.Scanner;
/**
 * Treasure.java
 * Represents a treasure that is a 
 * random occupant in the maze
 * @author Ankita Koratkar CPE 102-01
 * @version 03/6/2017
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
	
	public String toText(char delimiter){
		return super.toText(delimiter)+delimiter + found;
	}
	
	public void toObject(Scanner input){
		super.toObject(input);
		this.found = input.nextBoolean();
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
	
	public void moveTo(Square newLoc){
		if(this.location()!=null){
			this.location().setTreasure(null);
		}
		super.moveTo(newLoc);
		this.location().setTreasure(this);
		
	
	}
}

