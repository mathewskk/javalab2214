import java.util.Scanner;
public class AreaCir {
 AreaCir()
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Radius :");
 int r = sc.nextInt();
 double area = 3.14*r*r;
 System.out.print("The area is :"+area);
 }
 public static void main(String args[])
 {
 AreaCir obj = new AreaCir();
 }
}
