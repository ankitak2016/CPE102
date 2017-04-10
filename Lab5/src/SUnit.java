
public class SUnit {
	private static int testCount;
	private static int testFailed;
	
	public static int testsRun(){
		return testCount;
	}
	
	public static int testsFailed(){
		return testFailed;
	}
	
	public static void assertTrue(boolean actual){
		testCount = testCount+1;
		if(actual==false){
			Throwable throwable = new Throwable("Error: Expected true, found false");
			throwable.printStackTrace();
			testFailed = testFailed+1;
		}
	}
	
	public static void assertFalse(boolean actual){
		testCount = testCount+1;
		if(actual){
			Throwable throwable = new Throwable("Error: Expected false, found true");
			throwable.printStackTrace();
			testFailed = testFailed+1;
		}
	}
	
	public static void assertEquals(long expect, long actual){
		testCount = testCount+1;
		if(expect!=actual){
			Throwable throwable = new Throwable("Error: Expected " + expect+ ", found "+actual);
			throwable.printStackTrace();
			testFailed = testFailed+1;	
		}
	}
	
	public static void assertEquals(double expect, double actual, double epsilon){
		testCount = testCount+1;
		if(Math.abs(expect-actual)>epsilon){
			Throwable throwable = new Throwable("Error: Expected " + expect + " +/-"+ epsilon +", found "+actual);
			throwable.printStackTrace();
			testFailed = testFailed+1;
		}
	}
	
	public static void assertEqualsObject(java.lang.Object expect, java.lang.Object actual){
		testCount = testCount+1;
		if(expect.equals(actual)==false){
			Throwable throwable = new Throwable("Error: Expected object equality, found inequality");
			throwable.printStackTrace();
			testFailed = testFailed+1;	
		}
	}
	
	public static void assertEqualsReference(java.lang.Object expect, java.lang.Object actual){
		testCount = testCount+1;
		if(expect!=actual){
			Throwable throwable = new Throwable("Error: Expected reference equality, found inequality");
			throwable.printStackTrace();
			testFailed = testFailed+1;		
		}
	}
	
	public static void assertNull(java.lang.Object actual){
		testCount = testCount+1;
		if(actual!=null){
			Throwable throwable = new Throwable("Error: Expected null, found non-null");
			throwable.printStackTrace();
			testFailed = testFailed+1;	
		}
	}
	
	public static void assertNotNull(java.lang.Object actual){
		testCount = testCount+1;
		if(actual==null){
			Throwable throwable = new Throwable("Error: Expected non-null, found null");
			throwable.printStackTrace();
			testFailed = testFailed+1;	
		}
	}
	
	public static void fail(){
		testCount = testCount +1;
		Throwable throwable = new Throwable("Error: Explicit failure");
		throwable.printStackTrace();
		testFailed = testFailed+1;
		
	}
}
