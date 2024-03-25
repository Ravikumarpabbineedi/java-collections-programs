package java8features;

import java.util.function.Function;

/*class Functionimpl implements Function<String,Integer>
{
	@Override
	public Integer apply(String t)
	{
		return t.length();
	}
}*/
public class FunctinalInterfaceDemo {

	public static void main(String[] args) {
		//traditional approach
	//	Function<String,Integer> f=new Functionimpl();
		//System.out.println(f.apply("godsachin"));
		
		//lambda approach
		Function<String,Integer> f1=(t)->
		{
			return t.length();
		};
		System.out.println(f1.apply("captaincooldhoni"));
	}
}
