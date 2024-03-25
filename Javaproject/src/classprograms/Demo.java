package classprograms;
import java.util.*;
import java.lang.*;
public class Demo {
	public void finalize() throws Throwable
	{
	try
	{
		System.out.println("welcome java full stack");
	}
	catch(Throwable t)
	{
		throw t;
	}
	finally
	{
		super.finalize();
	}
	}
}
