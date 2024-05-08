package Mstf;

class App {
	
	public static void main (String [] args)
	{
		grade.run();	}
	
}

class grade
{
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Vize notunuz giriniz : ");
		int viz = kb.nextInt();
		
		System.out.print("Final notunuzu giriniz: ");
		int fin = kb.nextInt();
		grade.out(viz,fin);
	}
	
	public static void out(int a, int b)
	{
		System.out.printf("Vize: %d \nFinal: %d \nOrtalama:%.2f",a,b,gradeCalcu(a,b) );
	}
	public static double gradeCalcu(int a, int b)
	{
		return a*0.4 + b*0.6;
	}
}