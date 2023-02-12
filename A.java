import java.util.*;
public class A
{
	HashMap<String, Integer> map=new HashMap<String, Integer>(); 
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
}
public class B extends class A
{
	public static void main(String[] args)
	
	{
		
		for(Map.Entry<String,Integer> e : map.entrySet(c))
	{
		System.out.println(e.getKey() + ":-> " + e.getValue());
	  
} 
	}
}