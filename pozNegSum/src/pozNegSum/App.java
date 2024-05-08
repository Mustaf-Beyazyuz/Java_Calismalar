package pozNegSum;

public class App {
	
	public static void main(String [] args )
	{
		number.run();
	}

}

class number
{
	public static void run ()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayi giriniz");		
		System.out.printf("%d ",signum(kb.nextInt()));
	}
	public static int signum(int a)
	{
		if (a > 0 )return 1;
		else if (a < 0) return -1;
		return 0 ;
	}
}