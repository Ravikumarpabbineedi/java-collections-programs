package arraylistprograms;
import java.util.*;
public class ArrayListdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(80);
		l2.add(90);
		l2.add(100);
		l2.add(110);
		l2.add(120);
		/*System.out.println(l);
		System.out.println(l.size());
		if(l.isEmpty())
			System.out.println("list is empty");
		else
			System.out.println("it is not empty");
		int location;
		
		System.out.println("enter the index value");
		location=sc.nextInt();
		
		if(location>=0 && location<l.size())
		{
			Integer x=l.get(location);
			System.out.println(x);
		}
		else
			System.out.println("not valid index value");
		
		int loc,element;
		System.out.println("enter th location loc");
		loc=sc.nextInt();
		System.out.println("enter the element");
		element=sc.nextInt();
		
		if(loc>=0 && loc<l.size())
		{
			l.add(loc,element);
			System.out.println(l);
		}
		else
			System.out.println("invalid index to insert");
		
		int loc2;
		System.out.println("Enter the locarion to remove loc2");
		loc2=sc.nextInt();
		l.remove(loc2);
		System.out.println(l);
		
		int ele;
		System.out.println("enter the element to check it is present or not");
		ele=sc.nextInt();
		
		if(l.contains(ele))
			System.out.println("ele exists in list");
		else
			System.out.println("ele not exists in list");
		
		int ele2;
		System.out.println("enter the element to print its index value");
		ele2=sc.nextInt();
		System.out.println(l.indexOf(ele2));
		
		int sele,rpele;
		System.out.println("enter the source element to checkt it is present or not");
		sele=sc.nextInt();
		
		if(l.contains(sele))
		{
			System.out.println("enter the replacing element of source element");
			rpele=sc.nextInt();
			
			int x=l.indexOf(sele);
			
			l.set(x,rpele);
			
			System.out.println(l);
		}
		else
			System.out.println("source element not exists");
		
		for(Integer z:l)
			System.out.print(z+" ");
		
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i)+" ");
		}*/
		/*l.clear();
		System.out.println(l);	*/
		
//		l.addAll(l2);
//		System.out.println(l);
	
//		System.out.println(l.remove(Integer.valueOf(80)));
//		System.out.println(l);
		
		int min = l.get(0);
		for (Integer integer : l) {
			if(integer < min) {
				min = integer;
			}
		}
		System.out.println(min);
	}

}