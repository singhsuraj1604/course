import java.util.*;
public class Queue
{
	public static void main(String[] args)
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("suraj"); 
	System.out.println("Head" + queue.element());
	System.out.println("Head" + queue.peek());
	System.out.println("Iterating the Queue");
	Iterator<String> itr= queue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
    }	
queue.remove();
queue.poll();
System.out.println("After removing two element");
Iterator<String> itr2=queue.iterator();
while
}
}