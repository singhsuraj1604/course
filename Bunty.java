class P
 {
    public void Show()
	{
        System.out.println(" ");
    }
}

class C extends P
 {

    public void Show() 
	{
        System.out.println(" ");
    }
 }

class T extends C{
    public static void main(String[] args)
	{
        T s = new T();
        s.Show();
    }
}