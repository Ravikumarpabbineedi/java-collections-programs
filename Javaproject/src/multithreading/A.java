package multithreading;
import java.lang.*;
class B extends Thread
{

	public void run()
	{
		
				for(int i=1;i<=5;i++)
				{
				try
				
				{
				sleep(100);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		System.out.println("good morning");
				}
	}
}
class C extends Thread
{
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
	try
	
	{
	sleep(100);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
System.out.println("good evening");
	}
	}
}
public class A {

	public static void main(String[] args)throws Exception {
		B b=new B();
		B b1=new B();
		C c=new C();
		
		b.start();		
		c.start();
	}
}
