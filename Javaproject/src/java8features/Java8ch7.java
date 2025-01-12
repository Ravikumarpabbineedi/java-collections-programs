package java8features;

import java.util.*;

class Fruits{
	String fname;
	int fnumber;
	public Fruits(String fname, int fnumber) {
		super();
		this.fname = fname;
		this.fnumber = fnumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getFnumber() {
		return fnumber;
	}
	public void setFnumber(int fnumber) {
		this.fnumber = fnumber;
	}
	@Override
	public String toString() {
		return "Fruits [fname=" + fname + ", fnumber=" + fnumber + "]";
	}
}
public class Java8ch7 {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		
		m.put("Kiwi",20);
		m.put("Oranges",23);
		m.put("Apples",78);
		m.put("Grapes",67);
		m.put("Mangos",30);
		m.put("Pineappe",47);
		m.put("Banana",45);
		m.put("Strawberry",37);
		
		/*m.entrySet().stream().sorted((p1,p2)->p1.getKey().compareTo(p2.getKey())).forEach(System.out::println);
		m.entrySet().stream().sorted((p1,p2)->p1.getValue()-p2.getValue()).forEach(System.out::println);*/
		m.entrySet().stream().sorted((p1,p2)->p2.getValue().compareTo(p1.getValue())).forEach(System.out::println);
	}
}
