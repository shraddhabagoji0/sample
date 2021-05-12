package javamockpractice;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Demo4 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.add(1);
		pq.add(3);
		pq.add(2);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
	

	}

}
