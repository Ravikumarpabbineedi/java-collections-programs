package classprograms;

public class Outer {
	static void f1()
	{
		System.out.println("welcome to sathya");
	}
	 static class Inner
	{
		static void f2()
		{
			System.out.println("welcome to java");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();
	}

}
