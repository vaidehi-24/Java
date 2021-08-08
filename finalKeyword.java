 class Fruit
{
final int b=10;
	
void Seed()
{

Apple A = new Apple(); 
A.Nutrition();
}
	 
	
final void Peel()
{
System.out.println("Final method Peel "+ b);	
}

public static void main(String[] args)
{
	final int a;
    Fruit T = new Fruit();
    T.Seed();
	T.Peel();
	
}
}


class Apple
{
void Nutrition()
 {
    final int c=20;
    System.out.println("Apple Seed has a Poison " + c);	
 }


}


class Grapes extends Fruit
{
	
	
}
	
	
	

