package mapprograms;
import java.util.*;
public class Sortedmapdemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> sm=new TreeMap<>();
		
		sm.put(1,"sachin");
		sm.put(2,"kapil");
		sm.put(3,"virat");
		sm.put(4,"dhoni");
		sm.put(5,"rohit");
		
		System.out.println(sm);
		
		Collection<Integer> c=sm.keySet();
		for (Integer integer : c) {
			System.out.println(integer);
		}
		Collection<String> c1=sm.values();
		Iterator itr=c1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		for(Map.Entry<Integer,String> m:sm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());
		System.out.println(sm.headMap(2));
		System.out.println(sm.tailMap(5));
		System.out.println(sm.subMap(1,5));
		System.out.println(sm.comparator());
		System.out.println(sm.floorKey(2));
		System.out.println(sm.lowerKey(2));
		System.out.println(sm.ceilingKey(2));
		System.out.println(sm.higherKey(2));
		
		
		NavigableMap nm=sm.descendingMap();
		
		System.out.println(nm);
		
		System.out.println(sm.pollFirstEntry());
		System.out.println(sm.pollLastEntry());
	}
}
