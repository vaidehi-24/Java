import java.util.*;
import java.util.Scanner;
class Bank
{
      private String Accno;
      private String Name;
      private int Balance = 0;
  public static void main(String args[])
    {
      int Accno;
      int Name;
      int Balance = 0;

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Account No. :");
      Accno=sc.nextInt();
 
      System.out.print("Enter Your Name :");
      Name=sc.nextInt();

      Bank obj = new Bank();
      obj.AccountDetails();
      obj.Deposit();
      obj.Withdrawal(); 
    }

  void AccountDetails()
    {
      System.out.println(Accno + "," + Name + "," + Balance);
    }

  void Deposit()
    {
      int amount;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Amount :");
      amount = sc.nextInt();
      Balance = Balance + amount;
    }

  void Withdrawal()
    {
      int Amount;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Amount:");
      Amount =sc.nextInt();
       
        if(Balance>Amount)
          {
            Balance = Balance - Amount;
            System.out.println("Current balance :"+ Balance);
          }
        else
          {
            System.out.println("Insuffisient funds");
          }
    }
}