package arraylistprograms;
import java.util.*;

class Employee
{
	private int id;
	private String name;
	private float salary;
	private int dept;
	private String location;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
public class PojoAproach {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList<>();
		
		int id[]= {101,102,103,104,105,106};
		String name[]= {"Amar","Hareen","Sathya","Annie","Raji","Harsha"};
		int salary[]= {30000,35000,40000,45000,50000,55000};
		int dept[]= {20,10,20,20,30,10};
		String location[]= {"Hyderabad","Chennai","Bangalore","Hyderabad","Pune","Bangalore"};
		
		for(int i=0;i<id.length;i++)
		{
			Employee e=new Employee();
			
			e.setId(id[i]);
			e.setName(name[i]);
			e.setSalary(salary[i]);
			e.setDept(dept[i]);
			e.setLocation(location[i]);
			al.add(e);
		}
		
		
		boolean found=false;
		int count=0;
		for(int i=al.size()-1;i>=0;i--)
		{
			Employee e=al.get(i);
			/*if(e.getId()==103)
			{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getLocation());
			found=true;
			break;
			}
		}
		if(found==false)
			System.out.println("employee id doesnt exist");*/
			
			/*if(e.getLocation().equals("Hyderabad"))
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getLocation());
				count++;
			}
		}
			if(count==0)
				System.out.println("no such record with employee residing in hyderabad");*/
			
		/*if(e.getDept()==20 || e.getDept()==30)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getLocation());
		}*/
			
			/*if(!(e.getLocation().equals("Hyderabad")) && e.getDept()==20)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getLocation());
			} 	*/
			
			/*if(e.getName().equals("Amar"))
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary()+" "+e.getLocation());
			}*/
		}
		/*
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			Employee e=(Employee)li.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept()+" "+e.getLocation());
		}*/
		
		
	}

}
