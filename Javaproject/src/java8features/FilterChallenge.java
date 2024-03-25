package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;


class Products{
	String mobname;
	String color;
	int price;
	public Products(String mobname, String color, int price) {
		super();
		this.mobname = mobname;
		this.color = color;
		this.price = price;
	}
	public String getMobname() {
		return mobname;
	}
	public void setMobname(String mobname) {
		this.mobname = mobname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [mobname=" + mobname + ", color=" + color + ", price=" + price + "]";
	}
}
public class FilterChallenge {

	public static void main(String[] args) {
		
		ArrayList<Products> a=new ArrayList<Products>();
		
		a.add(new Products("Apple13","Pink",78000));
		a.add(new Products("Oneplus9","Gold",750000));
		a.add(new Products("Apple13","Pink",75200));
		a.add(new Products("OppoF17","Gold",9000));
		a.add(new Products("Vivo","Pink",22000));
		
		
		
		System.out.println(a.stream().filter(p->p.getMobname().contains("Apple")).count());
		//a.stream().filter(p->p.getColor().equals("Pink")).map(p->p.setColor(p.getColor()+"pinku");return;)
		//a.stream().map(p->p.getMobname()).forEach(System.out::println);
		//a.stream().filter(p->p.getPrice()>100000).forEach(System.out::println);
		//a.stream().filter(p->p.color.equals("Green") && p.price>50000).forEach(System.out::println);
		/*HashSet<Products> h=new HashSet<>(a.stream().filter(p->p.color.equals("Pink") && p.price<100000).collect(Collectors.toSet()));
		System.out.println(h);
		ArrayList<Products> b=new ArrayList(a.stream().filter(p->p.color.equals("Gold")).collect(Collectors.toList()));
		System.out.println(b);*/
		a.stream().filter(p->p.color.equals("Green") && p.price>50000).forEach(System.out::println);
	}
}
