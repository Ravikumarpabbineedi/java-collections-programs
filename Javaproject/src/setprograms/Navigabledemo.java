package setprograms;
import java.util.*;
public class Navigabledemo {

	public static void main(String[] args) {
		
		NavigableSet<Integer> ts=new TreeSet<>();
		
		ts.add(10);
		ts.add(80);
		ts.add(30);
		
		ts.add(40);
		ts.add(20);
		ts.add(40);
		
		System.out.println(ts);
		System.out.println(ts.lower(79));
		System.out.println(ts.higher(42));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.ceiling(42));
		System.out.println(ts.getFirst());
		System.out.println(ts.pollLast());
		System.out.print(ts);
	}

}
