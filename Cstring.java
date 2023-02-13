import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Cstring
{
static void display(String name1,String name2)
{
System.out.println("name1="+name1);
System.out.println("name2="+name2);
}
static void compare(String name1,String name2)
{
System.out.println(name1==name2);
}
static void add(String name1,String name2)
{
System.out.println(name1+name2);
}
static void concatenate(String name1,String name2)
{
System.out.println(name1.concat(name2));
}
public static void main(String args[])
{
try
{
String name1,name2;
int c,ch=1;
DataInputStream din=new DataInputStream(System.in);
Scanner console=new Scanner(System.in);
System.out.println("First string :");
name1=console.nextLine();
System.out.println("Second string :");
name2=console.nextLine();
do
{
System.out.println("1.display\n2.compare\n3.add\n4.concatenate\n");
c=Integer.parseInt(din.readLine());
switch(c)
{
case 1:display(name1,name2);
break;
case 2:compare(name1,name2);
break;
case 3:add(name1,name2);
break;
case 4:concatenate(name1,name2);
break;
}
System.out.println("Do you want to continue(0/1):");
ch=Integer.parseInt(din.readLine());
}
while(ch==1);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}