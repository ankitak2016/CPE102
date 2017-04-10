import java.util.Scanner;

/**
 * Monster.java
 * Represents a monster which
 * is a random occupant 
 * @author Ankita Koratkar CPE 102-01
 * @version 02/21/2017
 */
public class Monster extends RandomOccupant {
	
	public Monster(Maze maze){
		super(maze);
	}
	
	public Monster(Maze maze, long seed){
		super(maze,seed);
	}
	
	public Monster(Maze maze, Square location){
		super(maze,location);
	}
	
}

