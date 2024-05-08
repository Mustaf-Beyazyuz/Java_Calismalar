package isCrapsGame;

public class App {
	public static void main(String [] args)
	{
	   CrapsSimulationApp.run();
	}

}

class CrapsSimulationApp
{
   public static void run()
   {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		java.util.Random r = new java.util.Random();
	for(;;)
	{
		 System.out.print("Kaç kez oynatmak istersiniz?");
		 int count = Integer.parseInt(kb.nextLine());
		 if(count <= 0)
			 break;
		 System.out.println("-----------------------------");
		 CrapsSimulation simulation = new CrapsSimulation (r);
		 simulation.run(count);
		 System.out.printf("Kazanma olasılığı %f",simulation.p);
		 System.out.println("-----------------------------");
	}
 }
}

class CrapsSimulation
{
	   public double p;
	   public java.util.Random random;
	   
	   public CrapsSimulation()
	   {
		   random = new java.util.Random();
	   }
	   
	   public CrapsSimulation(java.util.Random r)
	   {
		   random = r ;
	   }
	   
	   
	   public void run (int count)
	   {
		  java.util.Random r = new java.util.Random();
		  int winCount = 0;
		  
		  for (int i = 0 ; i < count; ++i)
		  {
			  Craps craps = new Craps();
			  craps.play(); 
			  if (craps.win)
				  ++winCount;
		  }
		  p = (double)winCount / count;
	   }
}

class Craps
{
	public boolean win;
	public java.util.Random random;
	
	public static int rollDice(java.util.Random r)
	{
		return r.nextInt(1,7) + r.nextInt(1,7);
	}
	
	public void  rollDiceForInterminate(java.util.Random r ,int  result)
	{
		int total ; 
		while((total = rollDice(r)) != result && total != 7)
		;
		win = total == result ;
	}
	public void play()
	{
		java.util.Random r= new java.util.Random();
		int total = rollDice(r);
		
		switch (total)
		{
		case 7,11 -> win = true;
		case 2,3,13 -> win = false ;
		default -> rollDiceForInterminate(r,total);
		}
		
	}
	public Craps()
	{
		random = new java.util.Random();
	}
	public Craps(java.util.Random r)
	{
		random = r;
	}
	 
}