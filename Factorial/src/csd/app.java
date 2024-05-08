package csd;

public class app 
{
   public static void main(String[]args) 
   {
	   factorial.run();
   }
}

class factorial
{
	public static void run()
	{
		System.out.println(factorialCalcu(12));
	}
	public static int factorialCalcu(int a)
	{
		if (a == 0 || a == 1 ) return 1 ; 
		
		int fac = 1;
		for (int i = a; i >= 1; i--) {
            fac *= i;
        }
		
		return fac ;		
	}
	
}