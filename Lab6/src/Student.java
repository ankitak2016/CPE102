
public class Student extends Person {
	
	private double gpa;
	
	public Student(double gpa, String name, int numberofLegs){
		super(name,numberofLegs);
		this.gpa = gpa;
	}
	
	@Override
	public boolean equals(Object other){
		if(!super.equals(other)){
			return false;
		}
		
		if(gpa == ((Student)other).gpa){
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString(){
		return super.toString()+ " and a Student Object with a " + gpa + " gpa";
	}
	

}
