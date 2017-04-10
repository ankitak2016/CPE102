
public class Tester {
	
	public static void main(String args[]){
		System.out.println("First Test");
		Stack<String> stack = new Stack<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		stack.push("D");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Second Test");
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(new Integer(7));
		stack1.push(new Integer(8));
		stack1.push(new Integer(9));
		System.out.println(stack1.pop());
		stack1.push(new Integer(10));
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
	}
	
	
}
