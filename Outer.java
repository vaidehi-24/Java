class Outer
{
	class Inner
	{
		
		public void Demo()
		{
			System.out.println("Hello.. This is Inner class m1 method");
			
		}
		
	}
	
	public void Test()
	{
		Inner B = new Inner();
		B.Demo();
		
	}
	
    

}

class Extra
{
	
	public static void main(String args[])
	{
		
		System.out.println("Main Method run");
		
		Outer A = new Outer();
		A.Test();
		
	}
}