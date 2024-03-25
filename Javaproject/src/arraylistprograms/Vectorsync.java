package arraylistprograms;

import java.util.*;

class Test
{
	static List<Integer> v=new Vector<>();
}
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			Test.v.add(i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			Test.v.add(i);
		}
	}
}
public class Vectorsync {

	public static void main(String args[]) throws Exception
	{
		A a=new A();
		B b=new B();
		
		a.start();
		b.start();
		
		a.join();
		b.join();
		
		System.out.println(Test.v.size());
	}
}
