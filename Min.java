import java.util.Scanner;
class Min
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 3 digits:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int m=(a<b)?((a<c)?a:c):((b<c)?b:c);
System.out.print(m+" is the smallest number");
}
}
