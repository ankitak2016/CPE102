import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * BasicLinkedList.java
 * Represents a doubly linked list
 * @author Ankita Koratkar CPE 102-01
 * @version 03/15/2017
 */
public class BasicLinkedList<Element> implements BasicList<Element> {
	
	private int size;
	private Node first;
	private Node last;
	
	public BasicLinkedList(){
		size = 0;
		first = null;
		last = null;
	}
	
	public int size(){
		return  size;
	}
	
	public void add(Element element){
		Node newNode = new Node(element);
		if(size==0){
			first = newNode;
			last = newNode;
		} 
		else{
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}
		size++;
	}
	
	public void add(int index, Element element){
		if(index<0){
			throw new IndexOutOfBoundsException();
		}
		if(index!=0&&index>size){
			throw new IndexOutOfBoundsException();
		}

		Node newNode = new Node(element);
		if(index==0){
			if(size==0){
				first = newNode;
				last = newNode;
			}
			else{
				newNode.next=first;
				first.previous = newNode;
				first = newNode;
			}
		}
		else if(index==size){
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}
		else
		{
			Node p = getNode(index-1);
			newNode.next = p.next;
			p.next = newNode;
			newNode.next.previous = newNode;
			newNode.previous = p;
		}
		size++;
		
	}
	private Node getNode(int i){
		Node p = first;
		int pos = 0;
		while(pos!=i){
			p=p.next;
			pos++;
		}
		return p;
	}
	
	public void clear(){
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean contains(Element element){
		for(int i = 0;i<size;i++){
			Node node = getNode(i);
			if(node.element.equals(element)){
				return true;
			}
		}
		return false;
	}
	
	public Element get(int index){
		if(size == 0||index>=size||index<0){
			throw new IndexOutOfBoundsException();
		}
		return getNode(index).element;
	}
	
	public int indexOf(Element element){
		for(int i = 0;i<size;i++){
			if(getNode(i).element.equals(element)){
				return i;
			}
		}
		throw new NoSuchElementException();
		
	}
	
	public Element remove(int index){
		if(index>=size||size==0||index<0){
			throw new IndexOutOfBoundsException();
		}
		if(index==0){
			Element e = first.element;
			Node node = first.next;
			first = node;
			size--;
			return e;
		}
		else if(index==size-1){
			Element e = last.element;
			last.previous.next = null;
			last = last.previous;
			size--;
			return e;
		}
		else{
			Node p = getNode(index);
			Element e = p.element;
			p.previous.next = p.next;
			p.next.previous = p.previous;
			size--;
			return e;
		}
	}
	
	public Element set(int index, Element element){
		if(size==0||index<0||index>=size){
			throw new IndexOutOfBoundsException();
		}
		Node node = getNode(index);
		Element e = node.element;
		node.element = element;
		return e;
	}
	
	private class Node{
		public Element element;
		public Node next;
		public Node previous;
		
		public Node(Element element){
			this.element = element;
			next = null;
			previous = null;
		}
		
	}
	
	public BasicListIterator<Element> basicListIterator()
	{
	     return new InternalIterator();
	}
	
	public Iterator<Element> iterator()
	{
	     return new InternalIterator();
	}
	
	private class InternalIterator implements BasicListIterator<Element>
	{
	     private Node node = null;
	     
	     public boolean hasNext()
	     {
	        return false;
	     }
	     
	     public Element next()
	     {
	        return null;
	     }
	     
	     public boolean hasPrevious()
	     { 
	    	 return false;
	     }
	     
	     public Element previous()
	     {
	        return null;
	     }
	     
	     public void remove()
	     {	
	    	 throw new UnsupportedOperationException();
	     }
	}

}

