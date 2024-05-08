package isArmstrong;

public class csd {
	public static void main(String [] args)	
	{	
		IsArmstrongTest.run();
	}
}

class IsArmstrongTest {
	public static void run()
	{
		for (int a = -10; a <= 99999; ++a)
			if (NumberUtil.isArmstrong(a))
				System.out.println(a);
	}
	
}
class NumberUtil
{
	public static boolean isArmstrong(int a)
	{
		return a >= 0 && powSumDigits(a) == a; 
	}
	public static int powSumDigits(int a)
	{
		int n = countDigits(a);
		int sum = 0 ;
		while (a != 0)
		{
			sum += pow(a % 10 , n);
			a/=10;		
		}
		
		return sum;
	}
	public static int countDigits(int a)
	{
		int count = 0;
		
		do {
			++count;
			a /= 10;
		} while (a != 0); 
		
		return count;
	}
	public static int pow(int a, int b)
	{
		int result = 1;
		
		while (b-- > 0)
			result *= a;
		
		return result;
	}	
}