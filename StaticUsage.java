import java.util.Scanner;
public class StaticUsage
{
 Scanner input=new Scanner(System.in);
 String name;
 int age;
 static String college="RCSS";
 public static void ChangeCollegeName()
 {
 college="Rajagiri College Of Social Science(Autonomous)";
 }
 public void display()
 {
 System.out.println("Enter name");
 this.name=input.next();
 System.out.println("Enter age");
 this.age=input.nextInt();
 System.out.println("Name is "+this.name+ "\nAge is : "+this.age+ "\nCollege is : "+college);
 }
 public static void main(String [] args)
 {
 
 StaticUsage.ChangeCollegeName();
 StaticUsage su=new StaticUsage();
 StaticUsage su1=new StaticUsage();
 su.display();
 su1.display();
}}