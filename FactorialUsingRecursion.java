import java.util.Scanner;
public class FactorialUsingRecursion
{
 int f=1;
 public void fact(int n)
 {
 
 f=f*n;
 n=n-1;
 if(n>0)
 fact(n) ;
 else
 System.out.println("fact is "+f);
 }
 public static void main(String [] args)
 {
 Scanner input=new Scanner(System.in);
 System.out.println("Enter number");
 int n=input.nextInt();
 FactorialUsingRecursion obj=new FactorialUsingRecursion();
 obj.fact(n);
 
 }
}