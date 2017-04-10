
/**
 * A simple integer counter
 * @author ankitakoratkar
 * @version Lab 01
 * @version CPE102-01
 */
public class Counter {
  
  private int count; // current count
  private int modulus = 8; //modulus
  private int originalCount; //value of count before reset was used
  private boolean resetUsed = false; //if reset method has been used
  
  // Constructors:
  
  /**
   * Create a new Counter, with the count initialized
   * to 0.
   */
  public Counter () {
    count = 0;
  }
  
  /**
   * Create a new Counter, with the count initialized 
   * to 0 and modulus initialized to an integer
   */
  public Counter(int modulus){
	  this.modulus=modulus;
  }
  
  // Queries (Accessors):
  
  /**
   * The number of items counted.
   */
  public int currentCount () {
    return count;
  }
  
  // Commands (Mutators):
  
  /**
   * Increment the count by 1.
   */
  public void incrementCount () {

    count = count + 1;
	if(count==modulus){
		count = 0;
	}
  }
  
  /**
   * Reset the count to 0.
   */
  public void reset () {
	resetUsed = true;
	originalCount = count;
    count = 0;
  }
  
  /**
   * Assigns count the value before reset was used
   * If reset has not been used no changes are made to count
   */
  public void unReset(){
	  if(resetUsed){
	  count = originalCount;
	  }
	  else{
		  System.out.println("Reset method has not been used. No changes.");
	  }
  }
}
