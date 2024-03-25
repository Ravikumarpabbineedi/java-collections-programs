package arraylistprograms;

import java.util.*;

class Test1
{
	static ArrayList<Integer> a=new ArrayList<>();
	
}
class C extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=100;i++)
		{
			Test1.a.add(i);
		}
	}
}
class D extends Thread
{
	public synchronized void run()
	{
		for(int i=1;i<=100;i++)
		{
			Test1.a.add(i);
		}
	}
}
public class ArrayListsync {

	public static void main(String args[]) throws Exception
	{
		
		C c=new C();
		D d=new D();
		
		c.start();
		d.start();
		c.join();
		d.join();
		
		System.out.println(Test1.a.size());
	}
}


