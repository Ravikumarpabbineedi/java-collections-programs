package collectionsprograms;

import java.util.ArrayList;
import java.util.Collection;

public class Genericsdemo {

	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(2);
		c.add(545);
		c.add(445454);
		
		for(Object x:c)
			System.out.println(x);

	}

}
