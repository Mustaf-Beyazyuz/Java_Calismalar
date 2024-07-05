package isGetPrime;

public class app {
	public static void main(String [] args)	
	{	
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
			
			System.out.printf("%d.asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}
				
	}
}


class NumberUtil {
	public static int getPrime(int n)
	{
		int val = 2;
		
		for (int i = 0, count = 0; count < n; ++i)
			if (isPrime(i)) {
				++count;
				val = i;
			}
		
		return val;
	}
	
	public static boolean isPrime(long a)
	{
		if (a <= 1)
			return false;
		
		if (a % 2 == 0)
			return a == 2;
		
		if (a % 3 == 0)
			return a == 3;
		
		if (a % 5 == 0)
			return a == 5;
		
		if (a % 7 == 0)
			return a == 7;
		
		for (long i = 11; i * i <= a; i += 2)
			if (a % i == 0)
				return false;
		
		return true;
		
	}
}
