import java.util.Scanner;
import factorpak.Factor;
class Prime
{
 public static void main(String ad[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.print("\nEnter a number: ");
 int n = sc.nextInt();
 Factor f = new Factor();
 int x[] = f.fact(n);
 for(int i = 0; i < x.length; i++)
 {
 int y[] = f.fact(x[i]);
 try{
 if(y[0] == 0)
 System.out.print("\nPrime of " + n + " is " + x[i]); }
 catch(Exception e){ }
 }
 int y[] = f.fact(n);
 if(y[0] == 0)
 System.out.print("\nPrime of " + n + " is " + n);
 }
}
