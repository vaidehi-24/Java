 import java.util.*;
 interface Amazon{
 
     abstract public void Transaction();
 
 }
 
class Shop{
	
	void shopping(Amazon A){
		 
		 System.out.println("You Buy this product");
		 
	}
}

 class Bank implements Amazon{
	 
     final int shoppingcardID = 123;
	 int cardID;
	 int EXPdate ;
	 int EXPyear;
	 int CVV;
	
    Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your card Id :");
	    cardID = sc.nextInt();    

		System.out.println("Enter your Expiry date :");
	    EXPdate = sc.nextInt();  
	
		System.out.println("Enter your Expiry year :");
	    EXPyear = sc.nextInt();


		System.out.println("Enter your CVV :");
	    CVV = sc.nextInt();  
  		
	 void Transaction();
	 {
	    int TotalAmount;
	    int withdrawl;
		int Amount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Total Amount :");
	    TotalAmount = sc.nextInt();    
         
		 
	    Amount = TotalAmount - withdrawl;
	    System.out.println("Transaction is successfully done"+Amount);
	 }
 }    
 
 class User{
	 public static void main(String args[]){
		  
		  Shop S = new Shop();
		  S.shopping(new Bank());
	 }
	 
 }
 

 
 
 