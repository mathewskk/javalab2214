import java.util.Scanner;
public class Max
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c,max;
System.out.println("Enter 3 Numbers : ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
System.out.println("Entered Numbers are : "+a+" "+b+" "+c);
if(a>b)
{
System.out.println(a+" is greater than "+b);
}
else if(b>c)
{
System.out.println(b+ "is greater than "+c);
}
else if(a>c)
{
System.out.println(a+ "is greater than "+c);
}
else
{
System.out.println(c+ "is greater");
}
}
}
