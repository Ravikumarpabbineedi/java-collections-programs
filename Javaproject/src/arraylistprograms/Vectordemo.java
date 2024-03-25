package arraylistprograms;

import java.util.*;
public class Vectordemo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
