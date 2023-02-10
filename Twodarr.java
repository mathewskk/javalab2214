import java.util.Scanner;
public class Twodarr 
{
 public static void main(String args[]) 
{
 Scanner in = new Scanner(System.in);
 System.out.print("Enter the number of rows: ");
 int rows = in.nextInt();
 System.out.print("Enter the number of columns: ");
 int cols = in.nextInt();
 int arr[][] = new int[rows][cols];
System.out.println("Enter the elements of 2D array:");
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < cols; j++)
{
arr[i][j] = in.nextInt();
}
}
System.out.println("Entered Matrix:");
for(int i = 0; i < rows; i++)
{
for(int j = 0; j < cols; j++)
{
System.out.print(arr[i][j] + " ");
}
System.out.println();
}
System.out.println();
int sum = 0;
for(int i = 0; i < rows; i++)
{
int rowsum = 0;
for(int j = 0; j < cols; j++)
{
sum = sum + arr[i][j];
rowsum = rowsum + arr[i][j];
}
System.out.println("Sum of" + (i+1) + "rows is" + rowsum);
}
for(int i = 0; i < cols; i++)
{
int colsum = 0;
for(int j = 0; j < rows; j++)
{
colsum = colsum + arr[j][i];
}
System.out.println("Sum of" + (i+1) + "cols is" + colsum);
}
}
}

