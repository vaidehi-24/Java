import java.util.Scanner;
class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sumA = 0, sumB = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++)
          {
             a[i] = s.nextInt();
          }
        for(int i = 0; i < n; i++)
          {
              if(a[i] % 2 == 0)
               {
                 sumA = sumA + a[i];
               }
              else
               {
                sumB = sumB + a[i];
               }
          }
        System.out.println("Sum of Even Numbers:"+sumA);
        System.out.println("Sum of Odd Numbers:"+sumB);
    }
}