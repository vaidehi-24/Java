import java.util.Scanner;
class ArmstrongNo
{  
  public static void main(String[] args)  
   {  
    int c=0,a,temp;  
    int n;
      Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();     


  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("This is a armstrong number");   
    else  
        System.out.println("This is not armstrong number");   
   }  
}  