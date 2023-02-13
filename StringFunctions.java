import java.util.Scanner;
class StringFunctions
{
 public static Scanner input = new Scanner(System.in);
 public static void substr(String str)
 {
 int beg,end,length=str.length();
 do
 {
 System.out.println("Enter Beginning : ");
 beg=input.nextInt();
 System.out.println("Enter End : ");
 end=input.nextInt();
 if(beg<0 || end>length)
 System.out.println("!Invalid Values!");
 }while(beg<0 || end>length);
 System.out.println(str.substring(beg,end));
 }
 public static void main(String[] args)
 {
 String str,str1;
 int ch;
 System.out.println("Enter String : ");
 str=input.next();
 do
 {
 System.out.println("String Functions\n1.Length\n2.Compare\n3.Substring\n4.to 
Uppercase\n5.to Lowercase\n6.CANCEL\nEnter Option : ");
 ch=input.nextInt();
 switch(ch)
 {
 case 1 :
 System.out.println("String Length : " + str.length());
 break;
 case 2 :
 System.out.println("Enter Second String : ");
 str1=input.next();
 if(str.equals(str1))
 System.out.println("Strings are SAME");
 else
 System.out.println("...Strings are not same...");
 break;
 case 3 :
 substr(str);
 break;
 case 4 :
 System.out.println(str.toUpperCase());
 break;
 case 5 :
 System.out.println(str.toLowerCase());
 break;
 case 6 :
 System.out.println("...Cancelled...");
 break;
 default :
 System.out.println("!Invalid Choice!");
 break;
 }
 }while(ch!=6);
 }
}
