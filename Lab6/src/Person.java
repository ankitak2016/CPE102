
public class Person extends Animal {
	private String name;
	public Person(String name, int numberofLegs){
		super(numberofLegs);
		this.name = name;
	}
	
	@Override
	public boolean equals(Object other){
		if(!super.equals(other)){
			return false;
		}
		if(name == ((Person)other).name){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return super.toString() + " and a Person object whose name is " + name;
	}
}
