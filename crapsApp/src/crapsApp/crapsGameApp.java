package crapsApp.src.crapsApp;

public class crapsGameApp {
	public static void main (String [] args)
	
	{
		
		craps.run();
	}
}


class craps
{
   public static int count ;
	
   public static void run() {
	   
	   for(int i = 0 ; i <=100000 ; i++)
	   {
		   int r = random();
		   switch(r)
		   {
		    case 7,11 :
		    	{count++;}
		    case 2,3,12 :
		    	
		    default :
		        belirsiz(r);
		   }
	   }
	   ort(count);
   }
   public static int random()
   {
	   java.util.Random r = new java.util.Random();
	   int random = r.nextInt(1,7);
	   int random1 = r.nextInt(1,7);
	   return random+random1;  
   }
   

   public static boolean belirsiz(int a)
   {
		for(;;)
		{
			if (random() == a)
				{count++;  return true; }
			else if (random() == 7)
			return false;
		}
   }
  
   public static void ort(int a)
   {
	   double b = (10000 / a );
	   System.out.printf("%f",b);
	   
   }
}