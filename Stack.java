import java.util.*;
class Stack
{
 public static void main(String[] args)
 {
  Stack<String> stack= new Stack<String>();
   stack.push("Suraj");
   stack.push("Singh");
   stack.push("Raghuvanshi");
   stack.push("Shivam");
   
   Iterator itr=stack.iterator();
   while(itr.hasNext())
   {
   System.out.println(itr.next());
   }
 
 }
}