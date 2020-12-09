package JavaActivity8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Activity3_3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Lion");
		dq.add("Tiger");
		dq.add("Elephant");
		dq.add("Wolf");
		dq.add("Deer");
		dq.add("Bear");
		
		Iterator<String> i=dq.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("Head element of the queue :"+ dq.peekFirst());
		System.out.println("Tail element of the queue :"+dq.peekLast());
		
		if(dq.contains("Wolf")){
			System.out.println("wolf found");
		}
			else{
				System.out.println("Not found");
			}
		System.out.println("removing first and last element of the queue :"+dq.removeFirst()+ " and "+dq.removeLast());
		System.out.println("Size of the queue after removal :"+dq.size());
		}

	

}
