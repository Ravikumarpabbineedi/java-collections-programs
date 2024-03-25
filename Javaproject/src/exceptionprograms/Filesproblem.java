package exceptionprograms;
import java.io.*;
import java.lang.*;
public class Filesproblem {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader("E:sample55.jpg");
			 fw=new FileWriter("E:sample356.jpg");
			
			int i;
			while((i=fr.read())!=-1)
			{
				fw.write(i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally {
			if(fr!=null)
				fr.close();
			if(fw!=null)
			fw.close();
		}
	}

}
