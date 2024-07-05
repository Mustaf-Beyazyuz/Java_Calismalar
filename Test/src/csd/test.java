package csd;
class App {
	public static void main(String [] args)	
	{	
		CapitalizeTest.run();
	}
}

class CapitalizeTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			System.out.printf("[%s]%n", StringUtil.capitalize(s));
			
			if ("elma".equals(s))
				break;
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

class StringUtil
{
	public static String capitalize(String str)
	{
		return str.isEmpty() ? "" :  Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
	}
}





