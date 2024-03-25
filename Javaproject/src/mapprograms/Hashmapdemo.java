package mapprograms;
import java.util.*;

public class Hashmapdemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> h=new HashMap<>();
		
		//HashMap<Integer,String> h1=new HashMap<>();
		
		h.put(1,"ravi");
		h.put(2,"raki");
		h.put(3,null);
		h.put(4,"madhu");
		h.put(5,"bittu");
		h.put(6,"balu");
		
		
		
		
		System.out.println(h);
	/*	System.out.println(h.get(2));
		h1=(HashMap<Integer,String>)h.clone();
		System.out.println(h1);
		
		Collection<String> c=h.values();
		for (String s: c) {
			System.out.println(s);*/
			
		h.remove(null);
		System.out.println(h);
		System.out.println(h.get(null));
		System.out.println(h.containsKey(2));
		System.out.println(h.containsValue("ravi"));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.getClass());
		
		
		System.out.println(h);
		
		/*h.clear();
		System.out.println(h);*/
		
		Set<Integer> s=h.keySet();
		
		for (Integer key: s) {
			String value=h.get(key);
			System.out.println(key+" "+value);
		}
		
		AbstractMap<Integer,String> am=new HashMap<>();
		
		am.put(1,"sachin");
		am.put(2, "karthik");
		
		/*AbstractMap.SimpleEntry<Integer,String> am1=new AbstractMap.SimpleEntry<Integer,String>(2,"karthik");
		
		String newvalue="sachin";
		String oldvalue=am1.setValue(newvalue);*/
		
		am.replace(2,"sachin");
		
		for (AbstractMap.Entry<Integer,String> se:am.entrySet()) {
			System.out.println(se.getKey()+" "+se.getValue());
		}
	}
}