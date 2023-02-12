import java.util.*;
class A
{ 
   public void show()
   {
	for(Map.Entry<String,Integer> e : map.entrySet())
	{
		System.out.println(e.getKey() + ":-> " + e.getValue());
  	}
   }
}
public class Hashmap1 extends A
{
public static void main(String args[])
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
    //System.out.println(map);
	/*System.out.println(map.get("four"));
	if (map.containsKey("five"))
	{
	System.out.println("value present");
} else {
	System.out.println("doesnot prasent");
	*/
	for(Map.Entry<String,Integer> e : map.entrySet())
	{
		System.out.println(e.getKey() + ":-> " + e.getValue());
	    //System.out.println(e.getValue());
    /*if (map.Key()<=40 )
	{
		System.out.println(e.getKey() + ":-> " + e.getValue());
	} */
}
} 
}