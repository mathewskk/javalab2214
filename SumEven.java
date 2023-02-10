import java.util.Scanner;
class SumE
{
 void sum()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the limit : ");
 int n = sc.nextInt();
 int sum = 0;
 for(int i=2; i<=n; i=i+2)
 {
 sum = sum + i;
 }
 System.out.println("The sum is "+sum);
 }
}
public class SumEven
{
 public static void main(String args[])
 {
 SumE obj = new SumE();
 obj.sum();
 }
}