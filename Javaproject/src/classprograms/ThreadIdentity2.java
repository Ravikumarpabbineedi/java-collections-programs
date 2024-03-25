package classprograms;

public class ThreadIdentity2 implements Runnable{
	static Thread t;
	public ThreadIdentity2(String name) {
		ThreadIdentity2.t=new Thread(this,name);
		ThreadIdentity2.t.start();
	}
	public void run()
	{
		System.out.println(ThreadIdentity2.t.getName());
	}
	public static void main(String[] args) {
		ThreadIdentity2 ti2=new ThreadIdentity2("child");

	}

}
