import java.util.*;  
public class SortHashMapByKeys  
{  
public static void main(String args[])  
{  
//implementation of HashMap  
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
	List<String> employeeByKey = new ArrayList<>(map.keySet());
    Collections.sort(employeeByKey);
    Map<String, Integer> mp=new HashMap<String, Integer>(employeeByKey);    
    TreeMap<String, Integer> tm=new  TreeMap<String,Integer> (mp);  

for(Map.Entry<String,Integer> e : tm.entrySet())
	{
		//System.out.println(e.getKey() + ":-> " + e.getValue());
	    if(((e.getValue())>(35))){
              System.out.println(e.getKey() +"=>  "+ e.getValue());
        }
		else
		{
			
			System.out.println( e.getKey() +"=>  "+ e.getValue() + " "+ " : Age is Less Than 20");
		} 
}    
}  
}