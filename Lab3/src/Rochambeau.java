/**
 * Determines how the game 
 * Rochambeau is played
 * @author Ankita Koratkar
 * @version Lab 3
 * @version CPE102-01
 */
public class Rochambeau {
	
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	
	public Rochambeau(){
		
	}
	
	public static int getWinner(int throw1, int throw2){
		
		if(throw1==ROCK&&throw2==SCISSORS){
			return 1;
		}
		if(throw2==ROCK&&throw1==SCISSORS){
			return -1;
		}
		if(throw1==PAPER&&throw2==SCISSORS){
			return -1;
		}
		if(throw2==PAPER&&throw1==SCISSORS){
			return 1;
		}
		if(throw1==PAPER&&throw2==ROCK){
			return 1;
		}
		if(throw2==PAPER&&throw1==ROCK){
			return -1;
		}
		return 0;
		
	}

}
