import java.util.*;
class Program
{
public static void main(String args[])
{
	
ArrayList<Integer> arrlist=new ArrayList<Integer>();
 arrlist.add(10);
 arrlist.add(20);
 arrlist.add(10);
 arrlist.add(30);
 arrlist.add(20);
 arrlist.add(40);
 arrlist.add(50);
 arrlist.add(60);
 for(int i=0;i<arrlist.size();i++)
 {
	 int b=40;
	 if(b > arrlist.get(i))
	 {
		 System.out.println("Suraj");
	 }
	 else
	 {
		 System.out.println("Bunty");
	 }
 //System.out.println(arrlist.get(i));
}

}
}