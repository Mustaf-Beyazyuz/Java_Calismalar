package isCharacter;

public class App {

	public static void main (String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir yazı giriniz");
		
	  String str = kb.nextLine();
	  int whitespaceCount = 0, digitCount = 0, letterCount = 0;
	  
	  int len = str.length();
	  
	  for(int i = 0 ; i < len ; i++)
	  { 
		  char ch = str.charAt(i);
	  
	  if(Character.isWhitespace(ch))
		  whitespaceCount++;
	  
	  else if(Character.isDigit(ch))
		  digitCount++;
	  
	  else if(Character.isLetter(ch))
		  letterCount++;
	  
	  else
		  System.out.printf("%c",ch);
	  }
	  System.out.println("");
	  System.out.println();
		System.out.printf("Boşluk sayısı:%d%n", whitespaceCount);
		System.out.printf("Rakam sayısı:%d%n", digitCount);
		System.out.printf("harf sayısı:%d%n", letterCount);
	}
	
}
