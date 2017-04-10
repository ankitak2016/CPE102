/**
 * MazeReadException.java
 * Class for a MazeReadException
 * @author Ankita Koratkar CPE 102-01
 * @version 03/6/2017
 */
public class MazeReadException extends Exception{
	
	private String line;
	private int lineNumber;
	public MazeReadException(String message, String line, int lineNumber){
		super(message);
		this.line = line;
		this.lineNumber = lineNumber;
	}
	
	public String getLine(){
		return line;
	}
	
	public int getLineNum(){
		return lineNumber;
	}
	
	

}
