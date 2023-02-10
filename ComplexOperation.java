import java.util.Scanner;
public class ComplexOperation
{
 Scanner input=new Scanner(System.in);
 int real,imag;
 public void read_Complex()
 {
 System.out.println("enter real");
 int r=input.nextInt();
 System.out.println("Enter imag");
 int im=input.nextInt();
 this.real=r;
 this.imag=im;
 System.out.println(this.real +"+"+this.imag+"i");
 }
 public void sum_Complex(ComplexOperation c1,ComplexOperation c2)
 {
 ComplexOperation tmp=new ComplexOperation();
 tmp.real=c1.real+c2.real;
 tmp.imag=c1.imag+c2.imag;
 System.out.println("sum is "+tmp.real+ "+"+ tmp.imag+"i");
 }
 public void mul_Complex(ComplexOperation c1,ComplexOperation c2)
 {
 ComplexOperation tmp=new ComplexOperation();
 tmp.real=c1.real * c2.real;
 tmp.imag=c1.real*c2.imag;
 tmp.imag+=c1.imag*c2.real;
 tmp.real+=c1.imag*c2.imag*(-1);
 System.out.println("mul is "+tmp.real+"+"+tmp.imag+"i");
 }
 public static void main(String [] args)
 {
 
 ComplexOperation c1=new ComplexOperation();
 ComplexOperation c2=new ComplexOperation();
 ComplexOperation c3=new ComplexOperation();
 ComplexOperation c4=new ComplexOperation();
 c1.read_Complex();
 c2.read_Complex();
 c3.sum_Complex(c1,c2);
 c4.mul_Complex(c1,c2);
 }
}