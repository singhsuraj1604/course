import java.util.*;
class NoDuplicate {
	public static void main(String[] args)
	{
		ArrayList<Integer> collection = new ArrayList<Integer>();
	    collection.add(10);
		collection.add(20);
		collection.add(10);
		collection.add(30);
		collection.add(20);
		collection.add(40);
		collection.add(50);
		collection.add(60); 
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>(collection);
		ArrayList<Integer> numberlistwithoutduplicates = new ArrayList<Integer>(linkedhashset);
        System.out.println(numberlistwithoutduplicates);
	}
}
