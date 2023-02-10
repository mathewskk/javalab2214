import java.util.Scanner;
public class Sort {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 int i,j;
 System.out.println("Enter the size of the array:");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("Enter the elements:");
 for (i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
 }
 for (j = 0; j < n - 1; j++) {
 for (i = j + 1; i < n; i++) {
 if (arr[j] > arr[i]) {
 int temp = arr[j];
 arr[j] = arr[i];
 arr[i] = temp;
 }
 }
 }
 System.out.println("Sorted array :");
 for (i = 0; i < n; i++) {
 System.out.println(arr[i] + " ");
 }
 }
}