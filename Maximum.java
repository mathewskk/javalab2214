import java.util.Scanner;
public class Maximum
{
 public void Two_max(int a,int b)
 {
 if(a>b)
 {
 System.out.println("large of 2 numbers "+a);
 }
 else
 {
 System.out.println("large 2 numbers "+b);
 }
 }
 public int Two_max(int a,int b,int c)
 {
 int res=a>b?a:b;
 int output=res>c?res:c;
 return output;
 }
 public static void main(String [] args)
 {
 Scanner input=new Scanner(System.in);
 Maximum m=new Maximum();
 int a,b,c;
 System.out.println("enter fisrt no");
 a=input.nextInt();
 System.out.println("enter second number");
 b=input.nextInt();
 m.Two_max(a,b);
 System.out.println("enter third no");
 c=input.nextInt();
 int result=m.Two_max(a,b,c);
 System.out.println("large of 3 numbers "+result);
 }
}
