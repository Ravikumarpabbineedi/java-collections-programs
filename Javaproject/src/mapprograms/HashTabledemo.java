package mapprograms;
import java.util.*;
public class HashTabledemo {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> h=new Hashtable<>();
		
		h.put("ravi", 485);
		h.put("madhu", 485);
		h.put("bittu", 485);
		h.put("raki", 348);
		h.put("balu", 518);
		
		
		System.out.println(h.get("ravi"));
		System.out.println(h.get("madhu"));
		System.out.println(h.get("bittu"));
		System.out.println(h.get("raki"));
		System.out.println(h.get("balu"));
	}

}
