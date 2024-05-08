package Denklem;

public class Test {
	
	public static void main(String [] args) 
	{
		eguationSolverApp.run();
	}
	
}
class eguationSolverApp
{
	public static void run( )
	
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("a , b , c değerlerini giriniz.");
		double a = kb.nextDouble();
		double b = kb.nextDouble();
		double c = kb.nextDouble();
		
		eguationSolver.printRoots(a,b,c);	
	}
}

class eguationSolver
{	
	public static void printRoots (double a, double b, double c)
	{
		double delta = getDelta(a,b,c);
		
		if(delta > 0)
			doWorkForDifferentsRoots(delta,a,b);		
		else if(delta == 0 )
			doWorkForSameRoots(a,b);		
		else
			System.out.print("gerçek kök yok");				
	}
	
	public static double getDelta(double a, double b, double c)
	{
			return  b * b - 4 * a * c;
	}
	
	public static void doWorkForDifferentsRoots ( double delta, double a, double b)
	{		
		double x1,x2 ; 		
	    double sqrtdelta = Math.sqrt(delta);	    
	    
			x1  = (-b + sqrtdelta) / (2 * a);
			x2  = (-b - sqrtdelta) / (2 * a);
			
			System.out.printf("x1 = %f    x2 =  %f ",x1,x2);			
	}
			
	public static void doWorkForSameRoots (double a, double b)
	{
		double x ;
		x  = -b / (2 * a);	
		System.out.printf("x1 = x2 =  %f ",x);
	}
		
	}

	

