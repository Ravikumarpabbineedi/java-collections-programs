package setprograms;
import java.util.*;
public class LinkedHashSetdemo {

	public static void main(String[] args) {
	
		LinkedHashSet<Integer> ls=new LinkedHashSet<>();
		
		ls.add(10);
		ls.add(20);
		ls.add(60);
		ls.add(40);
		ls.add(50);
		ls.add(null);
		ls.add(20);
		
		
		ls.addFirst(20);
		ls.newHashSet(5);
		ls.addLast(99);
		
		LinkedHashSet<Integer> ls1=new LinkedHashSet<>();
		
		ls1=(LinkedHashSet)ls.clone();
		System.out.println(ls);
		System.out.println(ls1);
		ls1.clear();
		System.out.println(ls1);
		
		System.out.println(ls.getFirst());
	}

}
