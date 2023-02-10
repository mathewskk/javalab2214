import java.util.*;
public class RevNum {
 RevNum(int n)
 {
 int r = 0;
 while(n > 0)
 {
 int d = n % 10;
 r = r*10 + d;
 n = n/10;
 }
 System.out.println("Reversed number is "+r);
 }
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number :");
 int n = sc.nextInt();
 RevNum obj = new RevNum(n);
 }}
