import java.util.Scanner;
class Distance
{
 double feet,inches;
 void getdistance() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter feet> ");
feet = sc.nextDouble();
System.out.print("Enter inches> ");
inches = sc.nextDouble();
}
void addDistance(Distance d1, Distance d2)
{
double sumofFeet = d1.feet + d2.feet;
double sumofInch = d1.inches + d2.inches;
System.out.println(sumofFeet + " " + sumofInch);}
}
public class Dist
{ 
public static void main (String[] args)
{
 Distance d1 = new Distance();
 Distance d2 = new Distance();
//Distance d3 = new Distance();
System.out.println("Enter first distance ");
d1.getdistance(); 
System.out.println("Enter second distance ");
d2.getdistance(); 
d1.addDistance(d1,d2); 
}
}
