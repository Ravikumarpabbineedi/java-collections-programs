package java8features;

public class StreamApidemo {

	public static void main(String[] args) {
		
		/*Stream is a flow of data
		 *Stream API helps in filtering the data easily
		 *Stream is not a data structure and does not hold any information
		 *Stream will not modify the collection object
		 *Stream will process the elements of an object
		 *Creation of Stream:
		 *		Ex:List <Integer> l=new ArrayList<Integer>();
		 *			l.add(20);
		 *			l.add(30);
		 *			l.add(40);
		 *
		 *			Stream<Integer> s=l.stream();
		 *	stream():it is going to return stream of any collection object
		 *
		 *Creation of Stream for Array:
		 *		Ex:Integer a[]={3,4,5,6};
		 *			Stream<Integer> s=Arrays.stream(a);
		 *Stream operations:
		 *
		 *1).Intermediate operations:
		 *	->Intermediate operations are operation that transform and filter the stream in some way
		 *	->Intermidiate operations return a next stream and do not modify the oroginal stream
		 *	Ex:map(),filter(),distinct(),sorted()
		 *
		 *2).Termiminal operations:
		 *	->Terminla operations are opertaions that produce a result such as printing (or) collecting 
		 *		the stream into a collection (or)  a single value
		 *	Ex:forEach(),collect(),reduce(),count()
		 *
		 *Map() method of stream class;
		 *	1).It takes lambda Expression as it only a argument
		 *	2).Used to change every element in stream
		 *	3).It returns next stream object containing the changed values
		 *Ex:Map to convert all elements in array of string
		 *
		 *	String a[]=new String[]{"python","oracle","java"}
		 *	
		 */

	}

}
