package classprograms;

public class ThreadIdentity1 extends Thread {

	public ThreadIdentity1() {
	System.out.println(this.getName());	
	}
	public void run()
	{
		System.out.println(this.getName());
	}
	public static void main(String[] args) {
		ThreadIdentity1 ti1=new ThreadIdentity1();
		ti1.setName("child");
		ti1.start();
	}
}
