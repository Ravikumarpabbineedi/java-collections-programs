package classprograms;

public class A {
	int num;
	boolean setValue=false;
	public synchronized void put(int num)
	{
		while(setValue)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		System.out.println("put:"+num);
		this.num=num;
		setValue=true;
		notify();
	}
	public synchronized void get()
	{
		while(!setValue)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
			System.out.println("get:"+num);
			setValue=false;
			notify();
		
	}
}
