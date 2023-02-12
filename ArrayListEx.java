import java.util.*;
public class ArrayListEx
{
public static void main(String[] args)
{
ArrayList<Integer> sortedset= new ArrayList<>();
 sortedset.add(10);
 sortedset.add(20);
 sortedset.add(10);
 sortedset.add(30);
 sortedset.add(20);
 sortedset.add(40);
 sortedset.add(50);
 sortedset.add(60); 
 
/* for(Integer temp : sortedset)
 {
	 System.out.println(temp);
 } */
 
 Collections.sort(sortedset);
 
  System.out.println("after sorting....");
  
  for(Integer temp : sortedset)
  {
	  System.out.println(temp);
  }
}
}