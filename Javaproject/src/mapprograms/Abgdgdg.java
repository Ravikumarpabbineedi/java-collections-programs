package mapprograms;

import java.util.HashMap;

public class Abgdgdg {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<>();
		
		;
		
		h.put(1,"ravi");
		h.put(2,"raki");
		h.put(3,null);
		h.put(4,"madhu");
		h.put(5,"bittu");
		h.put(6,"balu");
		
		System.out.println(h);
		
		
		HashMap<Integer,String> h1=new HashMap<>(h);
		System.out.println(h1);
	}

}
