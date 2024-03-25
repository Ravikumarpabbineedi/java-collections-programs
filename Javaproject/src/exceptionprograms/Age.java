package exceptionprograms;
import java.util.*;
public class Age {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		try
		{
			int age;
			age=sc.nextInt();
			String s=sc.next();
			int b=Integer.parseInt(s);
			System.out.println(b);
			System.out.println(age);
		}
		catch(NumberFormatException | InputMismatchException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			sc.close();
			System.out.println("end of program");
		}
	}
}
