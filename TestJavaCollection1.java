import java.util.*;
class TestJavaCollection1
{
  public static void main(String args[])
  {
  ArrayList<String>list=new ArrayList<String>();
  list.add("sunil");
  list.add("suraj");
  list.add("raju");
  list.add("Bunty");
  list.add("Abhi");
  
  Iterator itr=list.iterator();
  while(itr.hasNext())
  {
	System.out.println(itr.next());  
  }
  }  

}