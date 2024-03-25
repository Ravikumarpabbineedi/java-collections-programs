package arraylistprograms;
import java.util.*;
class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		/*Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}*/
		
		ListIterator itr=al.listIterator(al.size());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
