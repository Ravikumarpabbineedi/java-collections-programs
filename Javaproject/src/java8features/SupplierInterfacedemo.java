package java8features;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*class Supplierimpl implements Supplier<LocalDateTime>
{
	public LocalDateTime get()
	{
		return LocalDateTime.now();
	}
}*/
public class SupplierInterfacedemo {

	public static void main(String[] args) {
		
	/*	Supplier<LocalDateTime> s=new Supplierimpl();
		System.out.println(s.get());*/
		
		Supplier<LocalDateTime> s1=()->
		{
			return LocalDateTime.now();
		};
		System.out.println(s1.get());
	}

}
