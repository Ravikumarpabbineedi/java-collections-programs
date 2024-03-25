package java8features;

import java.util.*;

class Prdtcs{
	int proId;
	String proName;
	int proPrice;
	public Prdtcs(int proId, String proName, int proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Prdtcs [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
}
public class Java8Ch10 {

	public static void main(String[] args) {
		List<Prdtcs> l=new ArrayList<>();
		
		l.add(new Prdtcs(1,"pen",10));
		l.add(new Prdtcs(2,"car",3000000));
		l.add(new Prdtcs(4,"fan",900));
		l.add(new Prdtcs(3,"chair",400));
		l.add(new Prdtcs(3,"Laptop",40000));
		l.add(new Prdtcs(3,"Laptop",50000));
		l.add(new Prdtcs(3,"Laptop",35000));
		l.add(new Prdtcs(2,"Mobile",10000));
		l.add(new Prdtcs(2,"charger",500));
		l.add(new Prdtcs(1,"pen",20));
		
		//l.stream().sorted((p1,p2)->p1.getProId()-p2.getProId()).sorted((p1,p2)->p1.getProName().compareTo(p2.getProName())).sorted((p1,p2)->p1.getProPrice()-p2.getProPrice()).forEach(System.out::println);
		l.stream().sorted((p1,p2)->p1.getProPrice()-p2.getProPrice()).sorted((p1,p2)->p1.getProName().compareTo(p2.getProName())).sorted((p1,p2)->p1.getProId()-p2.getProId()).forEach(System.out::println);
	}
}
