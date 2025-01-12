package java8features;

import java.util.*;

class Persons{
	private String name;
	private List<String> hobbies;
	public Persons(String name, List<String> hobbies) {
		super();
		this.name = name;
		this.hobbies = hobbies;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", hobbies=" + hobbies + "]";
	}
}
public class Java8Ch9 {

	public static void main(String[] args) {
		List<Persons> l=new ArrayList<Persons>();
		 Set<String> j=new HashSet<>();
		
		l.add(new Persons("madhu",List.of("reading","searching","cricket","listening")));
		l.add(new Persons("madhu",List.of("reading","searching","cricket","listening")));
		l.add(new Persons("ravi",List.of("playboy","richkid","cricket","reading")));
		l.add(new Persons("bittu",List.of("singing","politics","reading","bjpmember")));
		
		l.stream().map(p->p.getHobbies()).map(p->{j.addAll(p); return j; }).skip(l.size()-1).forEach(System.out::println);
		l.stream().map(p->p.getHobbies()).map(p->{j.addAll(p); return j; }).forEach(p->j.addAll(p));
		System.out.println(j);
	}
}
