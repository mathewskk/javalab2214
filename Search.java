import java.util.Scanner;
public class Search {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int[] arr = new int[5];
 int e,i,flag = 0;
 System.out.println("Enter the size :");
 int n = sc.nextInt();
 System.out.println("Enter The elements:");
 for (i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 System.out.println("Enter the element to be searched:");
 e = sc.nextInt();
 for (i = 0; i < n; i++) {
 if (arr[i] == e) {
 flag = 1;
 break;
 } 
 }
 if(flag == 1)
 {
 System.out.println("Element is found at"+(i+1));
 }
 else{
 System.out.println("Element is not found");
 }
 }
}
