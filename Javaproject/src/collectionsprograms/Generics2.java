package collectionsprograms;

import java.io.*;
import java.util.*;

public class Generics2 {

	public static void main(String[] args) {
		List<Object> c=new ArrayList<Object>();
		c.add(2);
		c.add(23.2f);
		c.add("java");
		
		/*converting Object to primitive types using get method in Listclass*/
		String x=(String)c.get(2);
		int y=(Integer)c.get(0);
		float f=(Float)c.get(1);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(f);
	}

}
