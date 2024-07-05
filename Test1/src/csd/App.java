package csd;

public class App {
	
	
	public static void main (String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Input your url");
		String address = kb.nextLine();
		
		
		//startsWith metodu yazının başında "https://" ile başlayıp başlamadığının sorgusunu yapıyor
		if(!address.startsWith("https://"))
			address = "https://" + address;
		System.out.print(address);
		
		
		
		System.out.print("Input your email");
		String email = kb.nextLine();
		
		
		//endsWith metodu yazının sonunda "".com"//" ile bitip bitmediğinin sorgusunu yapıyor.
		if(!email.endsWith(".com"))
			email = ".com" + email;
		System.out.print(email);
		
		
		System.out.print("Mail adresini giriniz");
		String mail = kb.nextLine();
		
		int  atInd = mail.indexOf("@"); //baştan @ index numarasını bul
		int  atInd2 = mail.lastIndexOf("@");//sondna @ index numarasını bul
		//atInd varsa yani -1 dönmezse 
		//ve atInd numarası ve atInd2 index numarasını birbirine eşitse
		//ve atInd yazının son elamanı değil ise if true 
		if(atInd != -1 && atInd == atInd2 && atInd != mail.length() -1 )
		{
			//atInd +1 den itibaren sondan arayarak "." yı ara eğer yok ise if true 
			if(mail.substring(atInd+1).lastIndexOf(".") == -1)
				mail +=".com "; //sonuna ".com ekle"
			
		}
		else
			System.out.print("invalid email"); //kurallar hariç hepsi geçersiz email dön
		
	}

}
