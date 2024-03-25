package java8features;

import java.util.*;

import javax.swing.text.html.Option;

class Prod{
	int proId;
	String proName;
	Double proPrice;
	public Prod(int proId, String proName, Double proPrice) {
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
	public String getproName() {
		return proName;
	}
	public void setproName(String proName) {
		this.proName = proName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Prod [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
}
public class Java8Ch6 {

	public static void main(String[] args) {
		List<Prod> p=new ArrayList<>();
		;
		p.add(new Prod(1001,"Sugar",120.0));
		p.add(new Prod(8974,"Salt",87.0));
		p.add(new Prod(3546,"Pepper",789.0));
		p.add(new Prod(4566,"Rice",1800.0));
		p.add(new Prod(1003,"Coffee",567.));
		p.add(new Prod(1878,"CookingOil",1768.));
		p.add(new Prod(1008,"Chocolate",90.));
		
		/*p.stream().sorted((p1,p2)->p1.getProId()-p2.getProId()).forEach(System.out::println);
	    p.stream().sorted((p1,p2)->p1.getProId()>p2.getProId()?1:-1).forEach(System.out::println);
		p.stream().sorted((p1,p2)->p1.getproName().compareToIgnoreCase(p2.getproName())).forEach(System.out::println);
		p.stream().filter(q->q.getProPrice()>100).sorted((p1,p2)->p1.getProPrice()<p2.getProPrice()?1:-1).forEach(System.out::println);
		p.stream().filter(k->k.getproName().startsWith("S")).sorted((p1,p2)->p1.getproName().compareTo(p2.getproName())).forEach(System.out::println);
		p.stream().filter(q->q.getProPrice()>=100 && q.getProPrice()<=200).sorted((p1,p2)->p1.getProPrice()<p2.getProPrice()?1:-1).forEach(System.out::println);
		p.stream().filter(q->q.getProPrice()>1000).map(q->{q.setProPrice(q.getProPrice()-.2*q.getProPrice()); return q;}).sorted((p1,p2)->p1.getProPrice()-p2.getProPrice()).forEach(System.out::println);
		p.stream().filter(q->q.getproName().startsWith("C")).sorted((p1,p2)->p2.getproName().compareTo(p1.getproName())).forEach(System.out::println);
		System.out.println(p.stream().max((p1,p2)->p1.getProPrice().compareTo(p2.getProPrice())).get());
		System.out.println(p.stream().min((p1,p2)->p1.getProPrice()>p2.getProPrice()?1:-1).get());*/
		Optional<Prod> opt=p.stream().filter(k->k.getproName().startsWith("S")).findAny();
//		opt.ifPresentOrElse(System.out::println,()->System.out.println("No"));
		opt.isEmpty();
	}
}
