import java.util.Scanner;
public class Palindrome
{
Scanner input=new Scanner(System.in);
int read_number()
{
int n;
System.out.println("Enter number");
n=input.nextInt();
return n;
}
void check_palindrome(int n)
{
int temp=n;
int digit;
int rev=0;
while(n>0)
{
digit=n%10;
rev=(rev*10)+digit;
n=n/10;
}
if(rev==temp)
{
System.out.println("palindrome");
}
else
{
System.out.println("no palindrome");
}
}
public static void main(String[] args)
{
Palindrome p=new Palindrome();
int num=p.read_number();
p.check_palindrome(num);
}
}