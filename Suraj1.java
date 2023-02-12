class Suraj1
{
public static void main(String[] args)
{
System.out.println("Statement one");
try
{
  System.out.println("Statement two");
  System.out.println(10/0);
}
catch(ArithmeticException e)
{
	e.printStackTrace();
  System.out.println(e.getMessage());
}
finally
{
	System.out.println("Statement five");
}  
}
}