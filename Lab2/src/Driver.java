/**
 * Designed to test the Greeter class
 * @author ankitakoratkar
 * @version Lab02
 * @version CPE102-01
 */
import java.util.Scanner;
public class Driver {
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		Greeter greeter = new Greeter(name);
		String greeting = greeter.greet();
		System.out.println(greeting);
		
	}

}
