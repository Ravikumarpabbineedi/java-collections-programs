package setprograms;

import java.util.*;
class Product implements Comparable<Product>{
	
	int id;
	String name;
	
	Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(Product ts)
	{
		return this.name.compareTo(ts.name);
	}
}

public class Treesetdemo {

	public static void main(String[] args) {
		
		TreeSet<Product> ts=new TreeSet<>();
		
		ts.add(new Product(3,"pen"));
		ts.add(new Product(5,"pencil"));
		ts.add(new Product(2,"sharpner"));
		ts.add(new Product(1,"eraser"));
		ts.add(new Product(4,"scale"));
		
		for(Product p:ts)
		{
			System.out.println(p.id+" "+p.name);
		}
		
		/*ts.add(40);
		ts.add(10);
		ts.add(30);
		ts.add(50);
		ts.add(60);
		ts.add(80);
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(80));
		System.out.println(ts.tailSet(10));
		System.out.println(ts.subSet(10,40));*/
		
	}

}
