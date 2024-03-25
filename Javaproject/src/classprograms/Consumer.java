package classprograms;

public class Consumer implements Runnable {
	A a;
	Consumer(A a)
	{
		this.a=a;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run()
	{
		while(true)
		{
			a.get();
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
