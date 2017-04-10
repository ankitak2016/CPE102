/**
 * Square.java
 * Represents a square in the maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class Square {
	
	public static final int SQUARE_SIZE = 50;
	public static final int UP = 0;
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	
	private boolean walls [];
	private boolean seen;
	private boolean inView;
	private int row;
	private int col;
	private Treasure treasure;
	
	public Square(boolean up, boolean right, boolean down, boolean left, int row, int col){
		walls = new boolean [4];
		walls[0]= up;
		walls[1]= right;
		walls[2]= down;
		walls[3]= left;
		this.row = row;
		this.col = col;
		treasure = null;
		this.inView= false;
		this.seen=false;
	}
	
	public boolean wall(int direction){
		if(direction==UP){
			return walls[0];
		}
		if(direction==RIGHT){
			return walls[1];
		}
		else if(direction==DOWN){
			return walls[2];
		}
		else{
			return walls[3];
		}
	}
	

	public boolean seen(){
		return seen;
	}
	
	public boolean inView(){
		return inView;
	}
	
	public int row(){
		return row;
	}
	
	public int col(){
		return col;
	}
	
	public int x(){
		return col*SQUARE_SIZE;
	}
	
	public int y(){
		return row*SQUARE_SIZE;
	}
	
	public Treasure treasure(){
		return treasure;
	}
	
	public void setInView(boolean inView){
		this.inView = inView;
		if(inView){
			this.seen = inView;
		}
	}
	
	public void setTreasure(Treasure t){
		treasure = t;
	}
	
	public void enter(){
		if(treasure==null){
			return;
		}
		else {
			treasure.setFound();
		}
	}
}