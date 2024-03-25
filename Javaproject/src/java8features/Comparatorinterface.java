package java8features;
import java.util.*;
public class Comparatorinterface {

	public static void main(String[] args) {
		
		ArrayList<Student55> al=new ArrayList<>();
		
		int rno[]= {1,2,3,4,5};	
		String nm[]= {"sachin","dhoni","kohli","sehwag","yuvi"};
		int ages[]= {35,45,66,85,95};
		
		for(int i=0;i<rno.length;i++)
		{
			Student55 s=new Student55();
			s.setRollno(rno[i]);
			s.setName(nm[i]);
			s.setAge(ages[i]);
			
			al.add(s);
		}
		
		Comparator<Student55> cm=Comparator.comparing(Student55::getName);
		
		Collections.sort(al,cm);
		
		for(Student55 s1:al)
		{
			System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getAge());
		}
	}

}
