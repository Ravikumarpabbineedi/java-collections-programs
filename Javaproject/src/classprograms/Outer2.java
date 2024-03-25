package classprograms;

public class Outer2 {

	static void f1()
	{
		System.out.println("welcome to sathyatechnologies");
	}
	static class Inner
	{
		 void f2()  //non static members
		{
			System.out.println("welcome to core java");
		}
	}

	public static void main(String[] args) {
		Outer2.f1();
		Outer2.Inner i=new Outer2.Inner();
		i.f2();
	}

}
