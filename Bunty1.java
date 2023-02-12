class Bunty1
{
public static void main(String[] args)
{
System.out.println("Statement one");
try
{
  System.out.println("Statement two");
  System.out.println(10/0);
}
catch(Exception e)
{
  System.out.println("Statement three");
}
finally
{
	System.out.println("Statement five");
}  
}
}