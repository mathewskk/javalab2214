import java.util.Scanner;
public class SumofDig
{
 int sum(int n)
{
 int s=0;
 while(n>0)
 {
 int digit=n%10;
 s=s+digit;
 n=n/10;
}
 return s;
 }
 public static void main(String [] args)
 {
 Scanner input=new Scanner(System.in);
 SumofDig obj=new SumofDig();
 int res;
 int n=input.nextInt();
 res=obj.sum(n);
 System.out.println("sum is "+res);
 }
}