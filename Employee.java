import java.util.*;
public class Employee
{
int eno;
String ename;
float esal;
void read()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the employee number : ");
eno=sc.nextInt();
System.out.print("Enter the employee name : ");
ename=sc.next();
System.out.print("Enter the employee salary : ");
esal=sc.nextFloat();
}
void display()
{
System.out.print("Employee Number : " + eno);
System.out.println();
System.out.print("Employee Name : " + ename);
System.out.println();
System.out.print("Employee Salary : " + esal);
System.out.println();
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of employees : ");
int n = sc.nextInt();
System.out.println();
Employees e[] = new Employees[n];
char ch;
for(int i=0; i<n; i++)
{
e[i]=new Employees();
System.out.print("Enter the details of employee" + (i+1) + " :-- ");
System.out.println();
e[i].read();
}
System.out.println();
for(int i=0; i<n; i++)
{
 System.out.print("Employee " +(i+1) +" Details :--");
 System.out.println();
 e[i].display();
}
System.out.println();
do
{
System.out.print("Search for an employee ?? Click Y for yes and N for no : ");
ch = sc.next().charAt(0); 
if(ch=='Y')
{
int flag=0;
System.out.println();
System.out.print("Enter the employee number to be searched : ");
int search = sc.nextInt();
for(int i=0; i<n; i++)
{
if(e[i].eno==search)
{
flag++;
System.out.print("Employee Found ");
System.out.println();
System.out.print("Employee Number : " + 
e[i].eno);
System.out.println();
System.out.print("Employee Name : " + 
e[i].ename);
System.out.println();
System.out.print("Employee Salary : " + 
e[i].esal);
System.out.println();
break;
}
}
if(flag==0)
System.out.print("Employee Not Found");
break;
}
else if(ch=='N')
{
System.out.print("Program Terminated Successfully");
break;
}
else
{
System.out.print("Invalid Choice");
}
}while(ch!='N');
}
}