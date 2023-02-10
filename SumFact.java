import java.util.Scanner;
public class SumFact
{
 public static void main(String args[])
 {
 int result=0;
 int fact = 1;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the limit :");
 int n = sc.nextInt();
 for(int i = 1; i<=n; i++)
 {
 fact = fact * i;
 result = result+(i/fact);
 }
 System.out.println("The result is "+result);
 }
}
