/**
 * BasicList.java
 * BasicList interface
 * @author Ankita Koratkar CPE 102-01
 * @version 03/15/2017
 */
public interface BasicList<E> extends Iterable<E> {
	public void add(E element);
	public void add(int index, E element);
	public void clear();
	public boolean contains(E element);
	public E get(int index);
	public E remove(int index);
	public E set(int index, E element);
	public int size();
	public BasicListIterator<E> basicListIterator();
	public java.util.Iterator<E> iterator();
}
