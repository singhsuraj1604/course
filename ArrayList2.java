import java.util.*;
class ArrayList2
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
 System.out.println(arrlist.get(i));
}
}
}