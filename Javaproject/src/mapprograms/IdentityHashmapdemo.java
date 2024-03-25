package mapprograms;
import java.util.*;
public class IdentityHashmapdemo {

	public static void main(String[] args) {
		
		/*IdentityHashMap h=new IdentityHashMap();
		h.put(1, "ravi");
		
		System.out.println(h);
		
		Integer h1=new Integer(10);
		Integer h2=new Integer(10);
		Integer h3=new Integer(10);
		Integer h4=new Integer(10);
		Integer h5=new Integer(10);
		
		if(h1==h2)
			System.out.println("yes");
		else
			System.out.println("no");*/
		
		WeakHashMap<Integer,String> whm=new WeakHashMap<>();
		
		Integer i1=new Integer(2);
		String s1=new String("sachin");
		
		Integer i2=new Integer(3);
		String s2=new String("kapil");
		
		whm.put(i1,s1);
		whm.put(i2,s2);
		
		System.out.println(whm);
		
		i2=null;
		
		System.gc();
		System.out.println(whm);
	}

}
