import java.util.*;
public class User 
{
public HashMap<String, Integer> getUserDetails()
{
  HashMap<String,Integer> map= new HashMap<>();
    map.put("Ajay" ,50);
	map.put("Sunil" ,45);
	map.put("Abhi", 40);
	map.put("Suraj", 30);
	map.put("Ramesh", 25);
	map.put("Saurabh",70 );
	map.put("Bunty",20 );
	map.put("Hemu", 80);
	map.put("Divy",15 );
	map.put("Bhawana", 17 );
    
	System.out.println("\nSorted Map......By Key");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(map);
        printMap(treeMap);
		return map;
	}
public class Love 
 {

    public static void main(String[] args)
    {
        User b=new User();
        HashMap<String, Integer> ab = b.getUserDetails();
        for (Map.Entry<String,Integer> e : ab.entrySet())
        {
            System.out.println(e.getKey());
        }
    }
}
}

