package isPyramid;

public class App {
	
	public static void main(String [] args)
	{
	Pyramid.runn();
	}
}

class Pyramid
{
     public static void runn()
     {
    	 java.util.Scanner kb = new java.util.Scanner(System.in);
    	 System.out.print("Piramid Kaç basamaklı olsun ?");
    	 int n = kb.nextInt();
    	 asteriksPyramid(n);
     }
     
     public static void asteriksPyramid(int a)
     {
    	 for(int i = 1; i <= a ; i++ )
    	 {    		 
    		for(int j = a - i ; j >= 1 ; j--  )
    		{
    			System.out.print(" ");
    		}
    		for(int l = 1 ; l <= i*2-1; l++ )
    		{
    			System.out.print("*");
    		}
    		System.out.println("");
    	 }
    	 
    	 for(int i = 1; i <= a - 1; i ++)
    	 {
    		 for(int j = 1; j <= i; j++)
    		 {
    			 System.out.print(" ");			 
    		 }
    		 for(int l = 2 *(a-i) - 1 ; l >= 1; l -- )
    		 {
    			 System.out.print("*");	
    		 }
    		 System.out.println("");
    	 }
     }
}
