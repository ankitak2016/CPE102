import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
/**
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 * 
 * @author Ankita Koratkar 
 * @version CPE 102 Project 3
 */
public class Maze
{
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] squares;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /**
    * Constructor for objects of class Maze
    */
   public Maze(Square[][] squares, int rows, int cols)
   {
      //initialize the squares, rows, and cols instance variables to
      //          what is passed in to the constructor
	  this.squares = squares;
	  this.rows = rows;
	  this.cols = cols;
      //create the empty ArrayList of RandomOccupants
	  randOccupants = new ArrayList<RandomOccupant>();
		
   }
   
   public Maze(){
	  randOccupants = new ArrayList<RandomOccupant>();
   }
   // QUERIES
   public Square getSquare(int row, int col) { return squares[row][col]; }
   public int rows() {return rows;}
   public int cols() {return cols;}
   public String explorerName() {return explorer.name();}
   public Explorer getExplorer() {return explorer;}
    
   // Implement the following two methods.  I have them stubbed to return dummy values just so it will compile.
   //          Your getRandomOccupant should return the occupant from the ArrayList at the specified index.
   public RandomOccupant getRandomOccupant(int index) {return randOccupants.get(index);}
   public int getNumRandOccupants() {return randOccupants.size();}
	
   // COMMANDS
   //  - implement the following method
   public void addRandomOccupant(RandomOccupant ro) { randOccupants.add(ro); }
	
   public void setExplorer(Explorer e) {explorer = e;}
	
   public void explorerMove(int key)
   {
      explorer.move(key);
   }
	
   public void randMove()
   {
      // instruct each object in the RandomOccupant to move
	   for(int i = 0;i<randOccupants.size();i++){
		   randOccupants.get(i).move();
	   }
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *    it is in the same location as the Explorer, return
    *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus()
   {
      int status = ACTIVE;
        
      // - implement
      if(foundAllTreasures()){
    	  return EXPLORER_WIN;
      }
      for(int i = 0;i<randOccupants.size();i++){
    	  if(randOccupants.get(i) instanceof Monster){
    		  if(randOccupants.get(i).location()==explorer.location()){
    			  return MONSTER_WIN;
    		  }
    	  }
      }
      return status;
   }
	
   private boolean foundAllTreasures()
   {
      boolean foundAll = true;
        
      //search through all the occupants to see if the Treasures have been found.  Return false if
      //        - there is a Treasure that hasn't been found.
      for(int i = 0;i<randOccupants.size();i++){
    	  if(randOccupants.get(i) instanceof Treasure){
    		  if(!((Treasure)randOccupants.get(i)).found()){
    			  return false;
    		  }
    	  }
      }
      return foundAll;
   }
    
   public void lookAround(Square s)
   {
      int row = s.row();
      int col = s.col();
        
      // Clear what was previously in view
      resetInView();
        
      // Set the current square so that we are viewing it (obviously)
      s.setInView(true);
        
      // - Check the adjacent squares.  If there isn't a wall in the way, set their inview to true.
      
      if(!squares[row][col].wall(Square.LEFT)){
    	  squares[row][col-1].setInView(true);
    	  if(!squares[row][col-1].wall(Square.DOWN)){
    		  squares[row+1][col-1].setInView(true);
    	  }
    	  if(!squares[row][col-1].wall(Square.UP)){
    		  squares[row-1][col-1].setInView(true);
    	  }
    	  
      }
 
      if(!squares[row][col].wall(Square.RIGHT)){
    	  squares[row][col+1].setInView(true);
    	  if(!squares[row][col+1].wall(Square.DOWN)){
    		  squares[row+1][col+1].setInView(true);
    	  }
    	  if(!squares[row][col+1].wall(Square.UP)){
    		  squares[row-1][col+1].setInView(true);
    	  }
      }
      //        - Check the diagonal squares.  If there isn't a wall in the way, set their inview to true.
      if(!squares[row][col].wall(Square.UP)){
    	  squares[row-1][col].setInView(true);
    	  if(!squares[row-1][col].wall(Square.LEFT)){
    		  squares[row-1][col-1].setInView(true);
    	  }
    	  if(!squares[row-1][col].wall(Square.RIGHT)){
    		  squares[row-1][col+1].setInView(true);
    	  }
      }
      
      if(!squares[row][col].wall(Square.DOWN)){
    	  squares[row+1][col].setInView(true);
    	  if(!squares[row+1][col].wall(Square.LEFT)){
    		  squares[row+1][col-1].setInView(true);  
    	  }
    	  if(!squares[row+1][col].wall(Square.RIGHT)){
    		  squares[row+1][col+1].setInView(true);
    	  }
      }
      
      

   }
    
   private void resetInView()
   {
      for (int i = 0; i<rows; i++) {
         for (int j = 0; j<cols; j++) {
            squares[i][j].setInView(false);
         }
      }
   }
   
   public void writeMazeToFile(String fileName) throws IOException{
	  PrintWriter output = new PrintWriter(new File(fileName));
	  output.println(rows+","+cols);
	  for(int i = 0;i<squares.length;i++){
		  for(int j = 0;j<squares[0].length;j++){
			  output.println(squares[i][j].toText(','));
		  }
	  }
	  output.println(explorer.toText(','));
	  for(int i = 0;i<randOccupants.size();i++){
		  output.println(randOccupants.get(i).toText(','));
	  }
	  output.close();
	  
   }
   
   public void readMazeFromFile(String fileName) throws IOException,FileNotFoundException,MazeReadException{
	// Scanner for the files, reading in a line at a time
	   	  
	   	  Scanner fileScanner = null;
			try {
				fileScanner = new Scanner(new File(fileName));
				} catch (FileNotFoundException e ) {
			}
			
	      // Scanner for a line, reading in items separated bt commas
	      Scanner lineScanner;
	       
	      // Read in a line
	      String line = fileScanner.nextLine();
	      // and create line scanner - comma delimited
	      lineScanner = new Scanner(line).useDelimiter(",");
	      int lineNumber = 1;
	      
	      if(lineScanner.hasNextInt()&&lineScanner.hasNextInt()){
	    	  int rows = lineScanner.nextInt();
	    	  int cols = lineScanner.nextInt();
	    	  this.rows = rows;
	    	  this.cols = cols;
	    	  squares = new Square[rows][cols];
	      }
	      else{
	    	  throw new MazeReadException("Rows and columns not specified.",line,lineNumber);
	      }
	      
	      // read the rest of the file
	      while (fileScanner.hasNext())
	      {
	         String token;
	         line = fileScanner.nextLine();
	         lineNumber++;
	         lineScanner = new Scanner(line).useDelimiter(",");
	         
	         if(lineScanner.hasNext()==false){
	        	 throw new MazeReadException("Line format or other error.",line,lineNumber);
	         }
	         
	         token = lineScanner.next();

	         if(token.equals("Square")){
	        	 
		        int row = lineScanner.nextInt();
		        int col = lineScanner.nextInt(); 
		        if(squares[row][col]!=null){
		        	throw new MazeReadException("Duplicate square.",line,lineNumber);
		        }
		        
		        squares[row][col]= new Square(row,col);
		        squares[row][col].toObject(lineScanner);
	         }
	         
	         else if(token.equals("Explorer")){
	        	 
	        	explorer = new Explorer(this);
	        	
	        	try{
	        		explorer.toObject(lineScanner);
	        	} catch(Exception e){
	        		throw new MazeReadException("Line format or other error.", line, lineNumber);
	        	}
	         }
	         
	         else if(token.equals("Monster")){
	        	 
	        	 Monster monster = new Monster(this);
	        	 
		        	try{
		        		monster.toObject(lineScanner);
		        	} catch(Exception e){
		        		throw new MazeReadException("Line format or other error.",line, lineNumber);
		        	}
		        	
	        	 randOccupants.add(monster); 
	         }
	         
	         else if(token.equals("Treasure")){
	        	 
	        	 Treasure treasure = new Treasure(this);
	        	 
		        	try{
		        		treasure.toObject(lineScanner);
		        	} catch(Exception e){
		        		throw new MazeReadException("Line format or other error.", line, lineNumber);
		        	}
		        	
	        	 randOccupants.add(treasure);
	         }
	         
	        else{
	        	 throw new MazeReadException("Unknown type.",line,lineNumber);
	         }
	        
	      } 
	      lineScanner.close();
	      fileScanner.close();
   }

}


