import java.util.Scanner;
/**
 * Square.java
 * Represents a square in the maze
 * @author Ankita Koratkar CPE102-01
 * @version 02/21/2017
 */
public class Square implements DelimitedTextIO{
	
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
	
	
	public Square(int row, int col){
		this.row=row;
		this.col=col;
		walls = new boolean[4];
	}
	
	public String toText(char delimiter){
		String text;
		text = getClass().getName()+delimiter+row+delimiter+col;
		for(int i = 0;i<4;i++){
			text = text + delimiter + walls[i];
		}
		return text + delimiter + seen + delimiter + inView;
	}
	
	public void toObject(Scanner input){
		for(int i = 0;i<4;i++){
			walls[i] = input.nextBoolean();
		}
		seen = input.nextBoolean();
		inView = input.nextBoolean();
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
			seen = inView;
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

