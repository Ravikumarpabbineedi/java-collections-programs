package multithreading;

import java.util.*;
public class Randnumandchars extends Thread {

	
	public Randnumandchars() {
		
	}
	public void run()
	{		
		Random r=new Random();
		for(int i=1;i<=10;i++)
		{
			System.out.println(r.nextInt(5000));
		}
	}
	
	public static void main(String args[])
	{
		Randnumandchars c=new Randnumandchars();
		c.start();
	}
}
