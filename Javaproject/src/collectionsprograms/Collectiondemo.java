package collectionsprograms;
import java.util.*;

public class Collectiondemo {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(2);
		c.add(20.54f);
		c.add("ravi");
		
		for(Object x:c)
			System.out.println(x);
	}

}
