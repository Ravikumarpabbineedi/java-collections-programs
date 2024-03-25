package multithreading;

public class Primenumbers extends Thread{

	int a;
	int c;
	public Primenumbers(int a,int c) {
		this.a=a;
		this.c=c;
	}
	public void run()
	{
		for(int i=a;i<=c;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}	
	public static void main(String args[])
	{
		Primenumbers p1=new Primenumbers(2,25);
		Primenumbers p2=new Primenumbers(26,50);
		Primenumbers p3=new Primenumbers(51,75);
		
		p1.start();
		p2.start();
		p3.start();
	}
}
