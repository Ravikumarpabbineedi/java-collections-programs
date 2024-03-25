package exceptionprograms;

import java.util.Scanner;
class ToOldExce extends Exception {

	public String getMessage()
	{
		return "pora musali";
	}
}
class ToYungExce extends Exception {

	public String getMessage()
	{
		return "pora kurra";
	}
}
class ChChotaExce extends Exception {

	public String getMessage()
	{
		return "lavada" ;
	}
}

public class Mariageeligible {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		try
		{
			int age=sc.nextInt();
			if(age<10)
				throw new ChChotaExce();
			if(age>10 && age<18)
				throw new ToYungExce();
			if(age>35)
				throw new ToOldExce();
			System.out.println("eligible to vote"+age);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}
		
}
