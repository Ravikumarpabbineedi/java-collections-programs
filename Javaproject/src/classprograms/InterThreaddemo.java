package classprograms;

public class InterThreaddemo {

	public static void main(String[] args) {
		A a=new A();
		new Producer(a);
		new Consumer(a);
	}
}
