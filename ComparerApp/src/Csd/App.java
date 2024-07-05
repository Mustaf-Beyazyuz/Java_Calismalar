package ComparerApp.src.Csd;

public class App {
	
	public static void main (String [] args)
	{
		ConcarerApp.run();
	}

}

class ConcarerApp
{
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("3 sayi giriniz");
		int s1 = kb.nextInt();
		int s2 = kb.nextInt();
		int s3 = kb.nextInt();
		concarer(s1, s2, s3);
		
	}
	
	public static void concarer(int a,int b, int c)
	{
		if (a < b && b < c) System.out.printf("%da < %db < %dc", a, b , c);	
		if (a < c && c < b) System.out.printf("%da < %dc < %da", a , c , b);    
		if (a == b && a < c) System.out.printf("%da = %db < %dc", a, b, c);		
		if (a == c && a < b) System.out.printf("%da = %dc < %db", a, c, b );				
		
		
		if (b < a && a < c) System.out.printf("%db < %da < %dc", b, a , c);				
		if (b < c && c < a) System.out.printf("%db < %dc < %da", b, c , a);   	
		if (b == a && c < b)System.out.printf("%dc < %db = %da", c, b, a );
		if (b == c && b < a)System.out.printf("%db = %dc < %da", b, c, a );			
		
		
		if (c < b && b < a) System.out.printf("%dc < %db < %da", c, b , a);			
		if (c < a && a < b)System.out.printf("%dc < %da < %db", c, a , b);	
		if (c == b && a < b)System.out.printf("%da < %db = %dc", a, b , c );
		if (c == a && b < a) System.out.printf("%db < %da = %dc", b, a, c );
		
		
		if (a == b && a == c)System.out.printf("%da = %db = %dc", a, b, c );
		
	}
	
}
