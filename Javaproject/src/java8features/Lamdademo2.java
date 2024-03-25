package java8features;

interface Add
{
	int addition(int a,int b); //abstract method
}

class Addimpl implements Add //implementing class
{
	public int addition(int a,int b){
		
		return a+b;
	}
}
public class Lamdademo2 {

	public static void main(String[] args) {
		
		Add a1=new Addimpl(); //traditional approach
		int c=a1.addition(20,30);
		System.out.println(c);
		
		Add a2=(a,b)-> //lambda approach
		{
			return(a+b);
		};
		int c1=a2.addition(30,40);
		System.out.println(c1);
	}

}
