/**
 * Sorts user input into 
 * int, double and random text
 * @author Ankita Koratkar
 * @version Lab 4
 * @version CPE102-01
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Lab4 {
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		ArrayList<String> stringList = new ArrayList<String>();
		Boolean input = true;
		while(input){
			System.out.println("Enter an int, double, any random text, or type quit to end:");
			if(scanner.hasNextInt()){
				int integer = scanner.nextInt();
				intList.add(new Integer(integer));
			}
			else if(scanner.hasNextDouble()){
				double doub = scanner.nextDouble();
				doubleList.add(new Double(doub));
			}
			else{
				String next = scanner.next();
				if(next.equals("quit")){
					input = false;
					break;
				}
				stringList.add(new String(next));
			}
		}
		
		scanner.close();
		
		System.out.println();
		System.out.println("Integers");
		for(int i = 0;i<intList.size();i++){
			System.out.println("  Integer[" + i + "] is "+ intList.get(i));
		}
		
		System.out.println();
		System.out.println("Doubles");
		for(int i = 0;i<doubleList.size();i++){
			System.out.println("  Double[" + i + "] is "+ doubleList.get(i));
		}
		
		System.out.println();
		System.out.println("Others");
		for(int i = 0;i<stringList.size();i++){
			System.out.println("  Others[" + i + "] is "+ stringList.get(i));
		}
	}
}
