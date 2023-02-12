import java.util.*;
 public class User 
{
public Map<String, Integer> getUserDetails()
{
  HashMap<String, Integer> map= new HashMap<String , Integer>();
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
    return map;
}
public class Map2
    {
	public static void main(String[] args)
	{
	User u=new User();
	  HashMap<String,Integer> ab= u.getUserDetails();
	  for(Map.Entry<String,Integer> e : ab.entrySet())
	{
		System.out.println(e.getKey());
	   // if(((e.getValue())>(35))){
         //     System.out.println(e.getKey() +"=>  "+ e.getValue());
        }
	//System.out.println(x);	
    } 
	}
	}

