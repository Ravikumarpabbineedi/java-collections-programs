package arraylistprograms;

import java.util.*;
class Students
{
	int id;
	String name;
	int age;
	float marks;
	
	public Students(int id,String name,int age,float marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
}
class Agecomparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Students s1=(Students)o1;
		Students s2=(Students)o2;
		
		
	/*	if(s1.age > s2.age)
			return 1;
		else
			return -1;*/
	//	return s1.name.compareTo(s2.name);
		
		if(s1.id > s2.id)
			return 1;
		else
			return -1;
		
	}

	@Override
	public String toString() {
		return "Agecomparator [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
public class Comparatordemo {
	
	public static void main(String[] args) {
		
		ArrayList<Students> al=new ArrayList<>();
		
		al.add(new Students(1,"ravi",22,354));
		al.add(new Students(6,"madhu",23,394));
		al.add(new Students(3,"raki",21,314));
		al.add(new Students(2,"bittu",25,384));
		al.add(new Students(9,"balu",26,454));
		
		Collections.sort(al,new Agecomparator());
		
		System.out.println(al);
	}

}
