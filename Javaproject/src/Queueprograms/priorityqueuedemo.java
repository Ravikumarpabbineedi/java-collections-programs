package Queueprograms;
import java.util.*;
public class priorityqueuedemo {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(4);
		q.add(8);
		q.add(9);
		q.add(1);
		q.add(25);
		q.add(35);
		
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		q.poll();
		q.poll();
		q.poll();
		System.out.println(q);
		
		Deque<Integer> q1=new ArrayDeque<>();
		
		q1.add(90);
		q1.add(20);
		q1.add(40);
		q1.add(30);
		q1.add(80);
		q1.add(10);
		
		System.out.println(q1);
		
		q1.addFirst(1);
		q1.addLast(2);
		System.out.println(q1.getFirst());
		System.out.println(q1.getLast());
		System.out.println(q1.removeLast());
		
		System.out.println(q1);
		
	}
}
