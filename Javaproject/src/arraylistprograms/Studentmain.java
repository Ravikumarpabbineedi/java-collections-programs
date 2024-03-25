package arraylistprograms;
import java.util.*;
public class Studentmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> al=new ArrayList<>();
		
		Student s1=new Student(1,"ravi","mech",2,74);
		Student s2=new Student(2,"madhu","ece",3,100);
		Student s3=new Student(3,"bittu","politics",1,89);
		Student s4=new Student(4,"rakesh","civil",4,99);
		Student s5=new Student(5,"naidu","eee",5,84);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Collections.sort(al,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
	
		for (Student student : al) {
			System.out.println(student.name);
		}
		System.out.println("a for add");
		System.out.println("i for insert");
		System.out.println("u for update");
		System.out.println("r for reverse");
		System.out.println("s for sort");
		System.out.println("d for display");
		
	/*System.out.println("enter the choice");
		char ch=sc.next().charAt(0);
		
	switch(ch)
		{
		case 'a':	System.out.println("enter the object elemnts to list");
					   int	rollno=sc.nextInt();
					   String name=sc.next();
					   String branch=sc.next();
					   int sem=sc.nextInt();
					   int marks=sc.nextInt();
					  
				Student s6=new Student(rollno,name,branch,sem,marks);
					al.add(s6);
		}
		sc.close();
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=(Student)itr.next();
			System.out.println(s.rollno+" "+s.name+" "+s.branch+" "+s.sem+" "+s.marks);
		}*/
	}
}
