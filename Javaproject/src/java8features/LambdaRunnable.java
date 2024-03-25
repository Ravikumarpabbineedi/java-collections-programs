package java8features;

class Threaddemo implements Runnable
{
	public void run()
	{
		System.out.println("hi world");
	}
}
public class LambdaRunnable {

	public static void main(String[] args) {
		
		 //traditional approach
		Thread t=new Thread(new Threaddemo());
		t.start();
		
		//lambda approach
		
		Runnable r=()->
			System.out.println("hi world");
		Thread t2=new Thread(r);
		t2.start();
	}
}
