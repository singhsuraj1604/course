import java.util.*;
class LinkedList
{ 
public static void main(String[] args)
{
	LinkedList <String> link=new LinkedList <String>();
	link.add("Mahesh");
	link.add("Suresh");
	link.add("Gyanesh");
	link.add("Jitendra");
    
 
	Iterator <String>itr= link.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
}