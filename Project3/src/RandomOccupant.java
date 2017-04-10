import java.util.Random;
/**
 * RandomOccupant.java
 * Represents an occupant that moves
 * randomly across the maze
 * @author Ankita Koratkar CPE102 -01
 * @version 2/21/2017
 */
public abstract class RandomOccupant extends Occupant {
	
	private Random rand;
	
	public RandomOccupant(Maze maze){
		super(maze);
		rand = new Random();
		int rows = maze.rows();
		int col = maze.cols();
		super.moveTo(maze.getSquare(rand.nextInt(rows), rand.nextInt(col)));	
	}
	
	public RandomOccupant(Maze maze, long seed){
		super(maze);
		rand = new Random(seed);
		int rows = maze.rows();
		int col = maze.cols();
		super.moveTo(maze.getSquare(rand.nextInt(rows), rand.nextInt(col)));
	}
	
	public RandomOccupant(Maze maze, Square location){
		super(maze,location);
		rand = new Random();
	}
	
	public void move(){
		Square square = super.location();
		int row = square.row();
		int col = square.col();
		int randint = 0;
		boolean canMove = false;
		while(!canMove){
			randint = rand.nextInt(4);
			if(square.wall(randint)){
				continue;
			}
			if(randint == Square.DOWN){
				if(row==super.maze().rows()){
					continue;
				}
				row = row+1;
				break;
			}
			if(randint == Square.UP){
				if(row==0){
					continue;
				}
				row = row-1;
				break;
			}
			if(randint == Square.RIGHT){
				if(col==super.maze().cols()){
					continue;
				}
				col = col+1;
				break;
			}
			if(randint == Square.LEFT){
				if(col==0){
					continue;
				}
				col = col-1;
				break;
			}
		}

		Square newSquare = super.maze().getSquare(row, col);
		super.moveTo(newSquare);
		
		
	}
}
