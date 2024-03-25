package arraylistprograms;
import java.util.*;
public class Stackoperations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		while(true)
		{	
			System.out.println("*****STACK OPERATIONS*****");
			System.out.println("1:PUSH");
			System.out.println("2:POP");
			System.out.println("3:PEEK");
			System.out.println("4:DISPLAY");
			System.out.println("5:SEARCH");
			System.out.println("6:EXIT");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			
			if(ch==1)
			{
				System.out.println("Enter the element to be push");
				int x=sc.nextInt();
				s.push(x);
				System.out.println(s);
			}
			else if(ch==2)
			{
				if(s.empty())
				System.out.println("Stack is empt");
				else
					System.out.println(s.pop());
					System.out.println(s);
			}
			else if(ch==3)
			{
				if(s.empty())
				System.out.println("Stack is empty");
				else
					System.out.println(s.peek());
			}
			else if(ch==4)
			{
				Iterator<Integer> l=s.iterator();
				while(l.hasNext())
				{
					System.out.println(l.next());
				}
			}
			else if(ch==5)
			{
				if(s.empty())
				System.out.println("Stack is empty");
				else
					System.out.println(s.search(40));
			}	
			else
				System.out.println("invalid choice");
		}
	}

}
