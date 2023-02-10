import java.util.Scanner;
public class Swap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 2 Numbers : ");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Before Swapping : "+a+" "+b);
int t = a;
a = b;
b = t;
System.out.println("After Swapping : "+a+" "+b);
}
}