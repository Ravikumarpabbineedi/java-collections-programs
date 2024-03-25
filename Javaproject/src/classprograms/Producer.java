package classprograms;

public class Producer implements Runnable {
	A a;
	Producer(A a)
	{
		this.a=a;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			a.put(i++);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
