import java.util.*;
public class Ifelse1 {
   public static void main(String[] args) {
	   
   List aList = new ArrayList();
aList.add("A");
aList.add("B");
aList.add("C");
aList.add("D");
aList.add("E");
if(aList.contains("C"))
   System.out.println("The element C is available in the ArrayList");
else
   System.out.println("The element C is not available in the ArrayList");
if(aList.contains("H"))
   System.out.println("The element H is available in the ArrayList");
else
   System.out.println("The element H is not available in the ArrayList");}
}