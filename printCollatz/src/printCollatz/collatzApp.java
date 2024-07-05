package printCollatz;

public class collatzApp {
	
	public static void main(String [] args)
	{
	collatz.printCollatz();	
	}
	

}

class collatz
{
	public static void printCollatz()
	{
		int n = 72543;
		while (n != 1)
		{
			if(n % 2 == 0)
				{n /= 2; print(n); }
			
			else				
				{n = n * 3 + 1; print(n);}			
		}
	}
	public static void print(int a)
	{
		System.out.printf(" %d ",a);
	}
	
}
