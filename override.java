class Animal
{
	
   void eat()
   {
       System.out.println(" Animal is eating");

   }	   
   void walk()
   {
       System.out.println(" Animal is walking");
	   
   }	
   static void Breath()
   {
	   System.out.println(" Animal is Breathing");
	   
   }
}

class Dog extends Animal
{
	
	void eat()
   {
       System.out.println(" Dog is eating");

   }
    void Bark()
	{
		System.out.println(" Animal is barking");
	}
   public static void main(String args[])
   {
	   Dog D = new Dog();
	   Animal A = new Dog();
	   Animal C = new Animal();
	   D.eat();
	   D.walk();
	   A.eat();
	   A.walk();
	   A.Bark();
	   C.eat();
	   C.walk();
	   
	   Animal.Breath();
	  // Dog.Bark();
	   
	   
   }
	
	
	
}