package java8features;

import java.util.*;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class Java8Ch8 {

	public static void main(String[] args) {
		List<Person> l=new ArrayList<>();
		
		l.add(new Person("MrRatan",26));
		l.add(new Person("kb",29));
		l.add(new Person("sathya",25));
		l.add(new Person("rahul",24));
		l.add(new Person("sandy",19));
		
		System.out.println(l.stream().min((p1,p2)->p1.getName().compareTo(p2.getName())).get());
		System.out.println(l.stream().max((p1,p2)->p1.getName().compareTo(p2.getName())).get());
		System.out.println(l.stream().min((p1,p2)->p1.getAge()-p2.getAge()).get());
		System.out.println(l.stream().max((p1,p2)->p1.getAge()-p2.getAge()).get());
	}

}
