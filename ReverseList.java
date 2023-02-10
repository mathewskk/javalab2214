import java.util.Scanner;
public class ReverseList
{
 int i=1;
 public void displayRev(int n)
 {
 
 if(n>=1)
 {
 System.out.println(n);
 n=n-1;
 displayRev(n);
 }
 else
 {
 return ;
 }
 }
 public void displayInAscOrder(int n)
 {
 
 if(i<=n)
 {
 System.out.println(i);
 i=i+1;
 displayInAscOrder(n);
 }
 }
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 System.out.println("Enter number");
 int n=input.nextInt();
 ReverseList rv=new ReverseList();
 System.out.println("display in reverse order");
 rv.displayRev(n);
 System.out.println("display in ascending order");
 rv.displayInAscOrder(n);
 }
}
