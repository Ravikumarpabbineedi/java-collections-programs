package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class Java8features {

	public static void main(String[] args) {
		
       List<Integer> l=new ArrayList<Integer>(Arrays.asList());
       Consumer<Integer> p=(u)->System.out.println(u);
       //Predicate<? super String> r=Exe::add;
     //  Function<String,Integer> m=(z)->Integer.parseInt(z);
       
       //l.forEach(p);
      // l.stream().map(m).reduce((a,b)->a+b);
     //System.out.println( l.stream().filter(r).reduce((a,b)->a+b));  
       Integer a=null;
       Optional<List<Integer>> opt=Optional.of(l);
       System.out.println(opt.orElse(Arrays.asList(5)));
       
	}

}
