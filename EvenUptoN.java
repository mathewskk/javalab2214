import java.util.Scanner;
public class EvenUptoN
{
 
 public static void display(int n)
 {
 
 for(int i=0;i<n;i=i+2)
 {
 System.out.println(i);
 }
 }
 public static void main(String[] args)
 {
 Scanner input=new Scanner(System.in);
 System.out.println("Enter n");
 int n=input.nextInt();
 display(n);
 }
}
