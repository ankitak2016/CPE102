
public class Greeter {
	
	private String name;
	
	public Greeter(String name){
		this.name = name;
	}
	
	public String greet(){
		String greeting = "Hello " + name;
		return greeting;
	}

}
