package classprograms;

public class ThreadIdentity extends Thread {

	public ThreadIdentity(String name) {
		super(name);
	}
	public void run()
	{
		System.out.println(this.getName());
	}
	public static void main(String[] args) {
		
		ThreadIdentity t1=new ThreadIdentity("child");
		t1.start();
	}

}
