package trimLeadingTrimTrailing;

public class App {
	public static void main(String [] args)	
	{	
		TrimLeadingTrailingTest.run();
	}
}

class TrimLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", StringUtil.trimLeading(s));
			System.out.printf("(%s)%n", StringUtil.trimTrailing(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}


class StringUtil {
	public static String trimLeading(String s)
	{
		int len = s.length();
		int i = 0 ;
		for(; i < len && Character.isWhitespace(s.charAt(i)) ;++i)
		;
		
		return s.substring(i);
	}
	public static String trimTrailing(String s)
	{
		int i ;
		for(i = s.length() - 1; i >= 0  && Character.isWhitespace(s.charAt(i)) ;--i)
		;
		
		return s.substring(0,i + 1);
	}
	
}
/*----------------------------------------------------------------------------------------------------------------------
	Java 11 ile birlikte String sınıfına strip, stripLeading ve stripTrailing metotları eklenmiştir
---------------------------------------------------------------------------------------------------------------------*/
class StripLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("elma".equals(s))
				break;
			
			System.out.printf("(%s)%n", s);
			System.out.printf("(%s)%n", s.strip());
			System.out.printf("(%s)%n", s.stripTrailing());
			System.out.printf("(%s)%n", s.stripLeading());
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}








