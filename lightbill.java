import java.util.*;
class LightBill
{
   public static void main(String args[])
    {
          int units;

          Scanner sc= new Scanner(System.in);
          System.out.print("Enter number of units :");  
          units= sc.nextInt(); 
      
           
      int bill=0;
        if(units<100)
           {
             bill=units*3;
           }
        else if(units<200)
           {
             bill=100*3+(units-100)*5;
           }
        else if(units<300)
           {
             bill=100*3+200*5+(units-200)*7;
           }
        else if(units>300)
           {
             bill=100*3+200*5+300*7+(units-300)*10;
           }
    System.out.println("Total bill:" + bill);
       }
}