package enBuyukEnKucukOrtama;



public class ortalamaApp {
	
	public static void main(String [] args)
	{
	 ortalama.input();
	}

}
class ortalama
{
	public static void input()
	{
		int newMin = 100,newMax = 0 , top = 0,count = 0;
		for(;;)
		{
			java.util.Scanner kb = new java.util.Scanner(System.in);
			
			System.out.print("Y musunuz ?\nEvet için 1(bir)\nHayır için 0(sıfır)");
			int a = kb.nextInt();
			if(a == 1)
			{
				System.out.print("Sayıyı Giriniz");
				int sayi = kb.nextInt();
				if(sayi > 0 && sayi <= 100) 	
				{	
				newMin = Math.min(newMin , sayi);
				newMax = Math.max(sayi, newMax);
				top += sayi ;
				count ++;
				}
				else
					System.out.print("Geçersiz bir değer girdiniz");
					
				 
			}
			else if (a == 0)
				{print(newMin,newMax,top,count);break;}
			else 
				System.out.print("Geçersiz seçenek");
		}
	}
	
	public static void print(int a, int b, int c, int d)
	{
		System.out.printf(" Min = %d %n Max = %d %n Toplam = %d %n Toplam Girilen adeti = %d %n Ortlaama = %d %n",a,b,c,d,c/d);
	}
	
}
