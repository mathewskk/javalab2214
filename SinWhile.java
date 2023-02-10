import java.util.Scanner;
public class SinWhile
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter m (First num): ");
 int m = sc.nextInt();
 System.out.println("Enter n (Last num): ");
 int n = sc.nextInt();
 while(m<=n)
 {
 System.out.print(m);
 System.out.println();
 m++;
 }
 }
}