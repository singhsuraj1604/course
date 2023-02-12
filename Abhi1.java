import java.util.*;
 class Abhi1{
  public static void main(String[] args)
  {
	/*HashMap<String, Integer> map=new HashMap<String, Integer>();  
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
*/	
	
	
	public class DataStorage {
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
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

    public HashMap<String, Integer> getmap() {
         return map;
    }
}

public class AnotherClass {
      DataStorage x = new DataStorage();       

      private void someMethod() {
           HashMap<String, Integer> map = x.getmap();
           //work with your map here...
      }  
}
  }
 }