package java8features;

import java.util.*;
import java.util.stream.Collectors;

class Juices{
	String name;
	String color;
	String  type;
	float price;
	public Juices(String name, String color, String type, float price) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Juices [name=" + name + ", color=" + color + ", type=" + type + ", price=" + price + "]";
	}
	
} 
public class Java8Ch5 {

	public static void main(String[] args) {
		
		List<Juices> j=new ArrayList<>();
		j.add(new Juices("OrangeJuice","Orange","Plastic",125.45f));
		j.add(new Juices("RedWine","Red","Glass",1467.23f));
		j.add(new Juices("TeaFlask","Silver","StainlessStell",1230.45f));
		j.add(new Juices("SpringWater","Red","Plastic",200.45f));
		j.add(new Juices("LemonSoda","Orange","Plastic",239.34f));
		j.add(new Juices("GreaanAplle","Silver","Glass",678.34f));
		j.add(new Juices("AppleCider","Red","Glass",899.23f));
		
	  /*List<Juices> l=j.stream().filter(p->p.getColor().equals("Red")).collect(Collectors.toList());
		l.forEach(System.out::println);
		Set<Float> s=j.stream().filter(p->p.getPrice()>500).map(p->p.getPrice()).collect(Collectors.toSet());
		s.forEach(q->System.out.println(q));
		System.out.println(j.stream().filter(p->p.getType().equals("Glass")).count());
		System.out.println(j.stream().map(p->p.getPrice()).reduce((p1,p2)->p1+p2));
		 j.stream().filter(p->p.getPrice()>1000).limit(1).forEach(System.out::println);*/
		j.stream().sorted((p1,p2)->p1.getColor().compareToIgnoreCase(p2.getColor())).forEach(System.out::println);
	}
}
