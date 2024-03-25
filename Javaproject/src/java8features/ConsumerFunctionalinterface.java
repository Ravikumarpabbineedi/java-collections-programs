package java8features;

import java.util.function.*;

/*class Consumerimpl implements Consumer<String>
{
	public void accept(String s)
	{
		System.out.println(s);
	}
}*/
public class ConsumerFunctionalinterface {

	public static void main(String[] args) {
		
		//traditional approach
	/*	Consumer<String> c=new Consumerimpl();
		c.accept("sachinsir");*/
		
		//lambda approach
		Consumer<String> c1=(k)->
		{
			System.out.println(k);
		};
		c1.accept("viratkohli");
	}
}
