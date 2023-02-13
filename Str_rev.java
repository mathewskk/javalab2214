import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Str_rev
{
public static void main(String args[])
{
try
{
int i;
Scanner console=new Scanner(System.in);
System.out.println("Enter the string:");
String name=console.nextLine();
int l=name.length();
for(i=l-1;i>=0;i--)
{
System.out.print(name.charAt(i));
}
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
