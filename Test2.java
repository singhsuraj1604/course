class P
 {
    public void show()
	{
        System.out.println("luxmi ");
    }
}
class A extends P
 {
	public void show()
	{
		System.out.println("Abhi");
	}
	
}
class C extends A
 {

    public void show() 
	{
        System.out.println(" katrina");
    }
 }

public class Test2 extends C 
{
public static void main(String[] args)
	{
		A b = new C();
		b.show();
    }
}