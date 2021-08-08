class Test{
   public void m1()
     {
	    System.out.println("No-args");
	 }
   public void m1(int i)
     {
	    System.out.println("Int-args");
	 }
   
	 
   
}

class Demo extends Test
{
	public void m1(double d)
     {
	    System.out.println("Double-args");
	 }
	
	
}

class Testmain
{
	
public static void main(String args[])
    {
	  Test T = new Test();
	  T.m1();
	  T.m1(10);
	  Demo D = new Demo();
	  D.m1(10.5);
	  D.m1(10.5f);
	  D.m1('a');
	}	
	
}