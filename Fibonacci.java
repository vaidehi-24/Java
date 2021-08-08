class Test 
{ 
	 
	static void FibonacciNumbers(int n) 
	{ 
		int a = 0, b = 1, i; 
	
		if (n < 1) 
			return; 
	
		for (i = 1; i <= n; i++) 
		{ 
			System.out.print(b+" "); 
			int next = a + b; 
			a = b; 
			b = next; 
		} 
	} 
	
	 
	public static void main(String[] args) 
	{ 
		FibonacciNumbers(20); 
	} 
} 
