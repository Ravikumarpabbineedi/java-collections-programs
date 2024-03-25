package mapprograms;
import java.util.*;;
public class Hashmapdemo2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<>();
		
		h.put(1,"ravi");
		h.put(2,"raki");
		h.put(3,"madhu");
		h.put(4,"bittu");
		h.put(5	,"balu");
		
		System.out.println(h);
		System.out.println("After sorting");
		Iterator<Integer> i=h.keySet().iterator();
		while(i.hasNext()) {
			int key=(int)i.next();
			System.out.println(key+" "+h.get(key));
		}
		
		Map<Integer,String> m=new HashMap<>(h);
		System.out.println("after sorting");
		//using treemap to sort the HashMap
		TreeMap<Integer,String> t=new TreeMap<>(m);
		Iterator i1=t.keySet().iterator();
		while(i1.hasNext())
		{
			int k=(int)i1.next();
			System.out.println(k+" "+t.get(k));
		}
	}
}
