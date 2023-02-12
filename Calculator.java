import java.util.Scanner;
public class Calculator 
{
public static void main(String args[])
{
int a,b,ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Number: " );
a=sc.nextInt();
System.out.println("Enter secont Number: ");
b=sc.nextInt();
System.out.println("Enter your Choice 1-> Add 2-> Subtract 3-> Multiply 4-> Divide \n Enter your Choice: ");
ch=sc.nextInt();
if(ch==1)
       System.out.println("Addition=" +(a+b));
else if(ch==2)
       System.out.println("Subtract="+(a-b));
else if(ch==3)
       System.out.println("Multiply="+(a*b));
else if(ch==4)
       System.out.println("Divide="+(a/b));
else
       System.out.println("invalid choice");
	   }
	   }