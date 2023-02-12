import java.util.*;
class GFG {
	public static void main(String[] args)
	{
		ArrayList<Integer> collection = new ArrayList<Integer>(Arrays.asList(10,20,10,30,20,40,50,60));
		/* collection.add(10);
		collection.add(20);
		collection.add(10);
		collection.add(30);
		collection.add(20);
		collection.add(40);
		collection.add(50);
		collection.add(60); */
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>(collection);
		ArrayList<Integer> numberlistwithoutduplicates = new ArrayList<Integer>(linkedhashset);
        System.out.println(numberlistwithoutduplicates);
	}
}
