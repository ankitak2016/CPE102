import java.util.LinkedList;

public class Stack<Element>{
	
	private LinkedList list;
	public Stack(){
		list = new LinkedList();
	}
	public Element pop(){
		return (Element) list.removeFirst();
	}
	
	public void push(Element e){
		list.addFirst(e);
	}
	
}
