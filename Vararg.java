class Test
{
   public void fun(int i)
   {
      System.out.println("General method");
	 
   }
   public void fun(int... i)
   {
      System.out.println("Var-args method");
   }
   public static void main(String args[])
   {
      Test T = new Test();
	  T.fun(10);
	  T.fun(10,20,30);
	  T.fun();
	  T.fun('a');
   }


}