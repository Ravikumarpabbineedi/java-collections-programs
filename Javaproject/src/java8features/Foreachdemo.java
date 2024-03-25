package java8features;
import java.util.*;

public class Foreachdemo {
 public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>(Arrays.asList("java"," ","spring","!"));
		/*StringBuilder sb=new StringBuilder();
		a.forEach(sb::append);
		System.out.println(sb.toString());*/
		String target ="java";
		int count[]= {0};
		
		a.forEach(s->{
				if(s.equals(target))
				{
					count[0]++;
				}
				});
		System.out.println("occurence of a string for"+target+"is"+count[0]);
 }
}

