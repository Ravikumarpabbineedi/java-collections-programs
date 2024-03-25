package java8features;

import java.lang.annotation.Retention;
import java.util.*;

class Country{
	String name;
	Double popul;
	String currency;
	String capital;
	int states;
	@Override
	public String toString() {
		return "Country [name=" + name + ", popul=" + popul + ", currency=" + currency + ", capital=" + capital
				+ ", states=" + states + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPopul() {
		return popul;
	}
	public void setPopul(double d) {
		this.popul = d;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getStates() {
		return states;
	}
	public void setStates(int states) {
		this.states = states;
	}
	
	public Country(String name, Double popul, String currency, String capital, int states) {
		super();
		this.name = name;
		this.popul = popul;
		this.currency = currency;
		this.capital = capital;
		this.states = states;
	}
}
public class Java8ch4 {

	public static void main(String[] args) {
			List<Country> l=new ArrayList<>();
			
			l.add(new Country("India",1380004385.0,"INR","Delhi",28));
			l.add(new Country("USA",33805545350.0,"USD","Washington",50));
			l.add(new Country("China",1448004385.0,"CNY","Beijing",23));
			l.add(new Country("Brazil",215000485.2,"BRL","Braslia",26));
			l.add(new Country("Australia",125494385.2,"AUD","Canberra",8));
			l.add(new Country("South Africa",59385.20,"ZAR","Petoria",9));

			
		  /*l.stream().map(p->p.getName()).forEach(System.out::println);
			l.stream().map(p->p.getName()+" "+p.getPopul()).forEach(System.out::println);
			l.stream().filter(p->p.getPopul()>1000000).map(p->{p.setPopul(p.getPopul()+.06*p.getPopul()); return p;}).forEach(System.out::println);
			l.stream().filter(p->p.getStates()<10).map(p->{p.setStates(p.getStates()+5); return p;}).forEach(System.out::println);
			l.stream().max((p,p2)->p.getPopul().compareTo(p2.getPopul())).stream().map(p->p.getName()).forEach(System.out::println);
			l.stream().min((p1,p2)->p1.getPopul().compareTo(p2.getPopul())).stream().map(p->p.getName()).forEach(System.out::println);*/
			l.stream().filter(p->p.getName().equals("USA")).map(p->{p.setStates(p.getStates()+3);return p;}).forEach(System.out::println);
			/*l.stream().filter(p->p.getName().equals("India")).map(p->{p.setCurrency("Rupee"); return p;}).forEach(System.out::println);
			System.out.println(l.stream().map(p->p.getPopul()).reduce((a,b)->a+b));
			System.out.println(l.stream().map(p->p.getStates()).reduce((a,b)->a+b));
			Double pops=l.stream().map(p->p.popul).reduce(0d,(p1,p2)->p1+p2);
			System.out.println(pops);
			System.out.println(l.stream().max((p1,p2)->p1.popul>p2.popul?1:-1).get());*/
	}
}
