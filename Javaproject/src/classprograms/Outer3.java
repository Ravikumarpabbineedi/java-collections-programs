package classprograms;

public class Outer3 {
	static void f1()
	{
		System.out.println("bye bye to sathyatechnologies");
	}
	class Inner
	{
		void f2()  //non static members
		{
			System.out.println("bye bye to core java");
		}
	}

	public static void main(String[] args) {
		Outer3.f1();
		Outer3 i=new Outer3();
		Outer3.Inner j=i.new Inner();
		j.f2();
	}
}
