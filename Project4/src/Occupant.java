import java.util.Scanner;
/**
 * Occupant.java
 * Represents a maze occupant
 * @author Ankita Koratkar CPE 102-01
 * @version 03/6/2017
 */
public abstract class Occupant implements DelimitedTextIO{
	
	private Square location;
	private Maze maze;
	
	public Occupant(Maze maze){
		this.maze = maze;
	}
	
	public Occupant(Maze maze, Square start){
		this.maze = maze;
		this.location = start;
	}
	
	public String toText(char delimiter){
		return getClass().getName() + delimiter + location.row()+delimiter + location.col();
	}
	
	public void toObject(Scanner input){
		int r = input.nextInt();
		int c = input.nextInt(); 
		Square sq = maze.getSquare(r,c);
		this.moveTo(sq);
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
