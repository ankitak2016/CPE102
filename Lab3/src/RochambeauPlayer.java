/**
 * Represents a player in 
 * Rochambeau
 * @author Ankita Koratkar
 * @version Lab 3
 * @version CPE102-01
 */
import java.util.Random;
public class RochambeauPlayer {
	
	private String name;
	private int numberOfWins;
	private String lastThrow;
	private Random rand;
	
	public RochambeauPlayer(String name){
		this.name = name;
		this.numberOfWins=0;
		this.lastThrow="No Throw";
		rand = new Random();
	}
	public String getName(){
		return name;
	}
	
	public int getWins(){
		return numberOfWins;
	}
	
	public String toString(){
		if(numberOfWins == 1){
			return name + " has 1 win.";
		}
		return name + " has "+ numberOfWins + " wins.";
	}
	
	public void incrementWins(){
		numberOfWins = numberOfWins+1;
	}
	
	public String lastThrow(){
		return lastThrow;
	}
	public int makeThrow(){
		int throwtype = rand.nextInt(3);
		if(throwtype == 0){
			this.lastThrow="ROCK";
		}
		else if (throwtype == 1){
			this.lastThrow = "PAPER";
		}
		else{
			this.lastThrow = "SCISSORS";
		}
		return throwtype;
	}
	
	public int makeThrow(int throwtype){
		if(throwtype == 0){
			this.lastThrow="ROCK";
		}
		else if (throwtype == 1){
			this.lastThrow = "PAPER";
		}
		else{
			this.lastThrow = "SCISSORS";
		}
		return throwtype;
	}
	
}
