package setprograms;
import java.util.*;
public class Hashsetdemo {

	//predefined methods of Hashset
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(null);
		
		System.out.println(hs);
		
		HashSet<Integer> hs1=new HashSet<>();
		
		hs1=(HashSet)hs.clone();
		System.out.println(hs1);
		
		if(hs1.contains(10))
			System.out.println("exists");
		else
			System.out.println("not exists");
		
		//hs.clear();
		System.out.println(hs.isEmpty());
		
		Iterator itr=hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(hs.remove(70));
		System.out.println(hs);
		
	}

}
