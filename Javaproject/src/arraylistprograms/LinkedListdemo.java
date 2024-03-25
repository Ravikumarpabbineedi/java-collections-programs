package arraylistprograms;

import java.util.*;
public class LinkedListdemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(null);
		l.add(40);
		l.add(2, null);
		l.add(1,25);
		l.addFirst(555);
		l.addLast(111);
		
		System.out.println(l);
		/*System.out.println(l.containsAll(l));
		System.out.println(l.get(0));
		System.out.println(l.size());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.peekFirst());*/
		
		/*Iterator ir=l.descendingIterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		*/
		/*ListIterator<Integer> li=l.listIterator(l.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}*/
		
		System.out.println(l.remove(1));
		System.out.println(l);
		System.out.println(l.removeFirstOccurrence(555));
		System.out.println(l);
		System.out.println(l.set(0,143));
		System.out.println(l);
		System.out.println(l.size());
	}

}
