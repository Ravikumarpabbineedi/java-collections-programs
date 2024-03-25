package java8features;

interface Shape
{
	public void draw(); //abstract method
}
public class LamdaDemo {

	public static void main(String[] args) {
		
		//implementation by means of lambda expression
		Shape square=()->System.out.println("Draw method for square shape");
		square.draw();
		Shape rectangle=()->System.out.println("Draw method for rectangle shape");
		rectangle.draw();
		Shape triangle=()->System.out.println("Draw method for triangle shape");
		triangle.draw();
		
		//passing lambda expresssion as an argument
		
		print(()->System.out.println("Draw method for square shape"));
		print(()->System.out.println("Draw method for rectangle shape"));
		print(()->System.out.println("Draw method for triangle shape"));
	}
	//called method
	private static void print(Shape shape)
	{
		shape.draw();
	}
}
