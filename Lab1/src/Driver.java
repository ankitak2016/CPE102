/**
 * Designed to test the Counter class
 * @author ankitakoratkar
 * @version Lab 01
 * @version CPE102-01
 */
public class Driver {
	
	public static void main(String []args){
		
		//Testing modulus class
		System.out.println("First Counter Object");
		System.out.println("Modulus: 8");
		Counter ct1 = new Counter();
		//Print initial count
		System.out.println("Initial Count: "+ct1.currentCount());
		//Calls the incrementCount method 10 times
		for(int i = 0;i<10;i++){
			ct1.incrementCount();
			System.out.println("Incremented Count: "+ct1.currentCount());
		}
		//Reset Method
		ct1.reset();
		System.out.println("Reset:"+ct1.currentCount());
		//UnReset Method
		ct1.unReset();
		System.out.println("UnReset:"+ct1.currentCount());
		
		//Second Modulus Class Test
		System.out.println();
		System.out.println("Second Counter Object");
		System.out.println("Modulus : 9");
		Counter ct2 = new Counter(9);
		//Calls the incrementCount method 10 times
		System.out.println("Initial Count: "+ct2.currentCount());
		for(int i = 0;i<10;i++){
			ct2.incrementCount();
			System.out.println("Incremented Count: "+ ct2.currentCount());
		}
		System.out.println("Calls unReset");
		ct2.unReset();
		System.out.println("unReset:"+ct2.currentCount());
		System.out.println("Value before reset:" + ct2.currentCount());
		ct2.reset();
		System.out.println("Reset:"+ ct2.currentCount());
		ct2.incrementCount();
		System.out.println("Incremented Count: "+ ct2.currentCount());
		ct2.incrementCount();
		System.out.println("Incremented Count: " + ct2.currentCount());
		ct2.unReset();
		System.out.println("unReset:"+ct2.currentCount());
		
	}

}
