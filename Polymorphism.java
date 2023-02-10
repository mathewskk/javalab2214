import java.util.Scanner;
interface Area
{
 public void area();
}
class Triangle implements Area
{
 double base,height;
 public Triangle()
 {
 Scanner input = new Scanner(System.in);
 System.out.println("Enter Base of Triangle : ");
 base=input.nextDouble();
 System.out.println("Enter Height of Triangle : ");
 height=input.nextDouble();
 }
 public void area()
 {
 System.out.println("Area = " + 0.5*base*height);
 }
}
class Polymorphism
{
 public static void main(String[] args)
 {
 Area t;
 t = new Triangle();
 t.area();
 }
}