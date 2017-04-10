import java.util.Iterator;
/**
 * BasicListIterator.java
 * BasicListIterator interface
 * @author Ankita Koratkar CPE 102-01
 * @version 03/15/2017
 */
public interface BasicListIterator<E> extends Iterator<E>{
	public boolean hasPrevious();
	public E previous();
}
