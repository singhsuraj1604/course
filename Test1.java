class P
 {
    public void show()
	{
        System.out.println("luxmi ");
    }
}

class C extends P
 {

    public void show() 
	{
        System.out.println(" katrina");
    }
 }

public class Test1 extends C
{
	public void show()
	{
		System.out.println(" Suraj");
	}

    public static void main(String[] args)
	{
		C b = new Test1();
		b.show();
    }
}