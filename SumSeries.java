import java.util.Scanner;
public class SumSeries
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the limit :");
 int n = sc.nextInt();
 int sum=0;
 int i =1;
 while(i<=n)
 {
 sum=sum+i;
 i++;
 }
 System.out.println("Sum of the series equals to "+sum);
 }
}