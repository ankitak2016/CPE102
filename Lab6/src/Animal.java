
public class Animal {
	
	private int numberofLegs;
	
	public Animal(int numberofLegs){
		this.numberofLegs = numberofLegs;
	}
	
	@Override 
	public boolean equals(Object other){
		if(other==null){
			return false;
		}
		if(other.getClass()==this.getClass()){
			if(numberofLegs == ((Animal)other).numberofLegs){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		return "I am an Animal object with " + numberofLegs + " legs";
	}
}
