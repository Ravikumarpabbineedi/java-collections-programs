package java8features;


/*@FunctionalInterface
interface Greetings{
	void greet(String name);
}*/

@FunctionalInterface
interface Service{
	public String voteCheck(String name,int age,String location);
}
public class Java8_paper2Challenge {

	public static void main(String[] args) {
		
	/*	Greetings g=(s)->{
			System.out.println("Good"+s);
		};
		g.greet("Morning");*/
		
		Service s=(name,age,location)->{
				
				String result;
				
				if(age>=18 && location.equals("Hyderabad")) {
					return "Yes";
				}
				else
					return "No";
		};
		System.out.println(s.voteCheck("ravi",25,"Hyderabad"));
	}

}
