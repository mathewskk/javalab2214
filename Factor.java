package factorpak;
public class Factor
{
 public int[] fact(int n)
 {
 int a[] = new int[n/2];
 int i=0;
 for(int j=2; j <= (n/2); j++)
 {
 if(n%j == 0)
 a[i++] = j;
 }
 return a;
 }
}
