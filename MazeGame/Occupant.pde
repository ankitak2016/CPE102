/**
 * Occupant.java
 * Represents a maze occupant
 * @author Ankita Koratkar CPE 102-01
 * @version 02/21/2017
 */
public abstract class Occupant {
	
	private Square location;
	private Maze maze;
	
	public Occupant(Maze maze){
		this.maze = maze;
	}
	
	public Occupant(Maze maze, Square start){
		this.maze = maze;
		this.location = start;
	}
	
	public Square location(){
		return location;
	}
	
	public Maze maze(){
		return maze;
	}
	
	public void moveTo(Square newLoc){
		location = newLoc;
	}
}
