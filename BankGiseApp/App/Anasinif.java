package BankGiseApp.App;

import java.util.Scanner;

public class Anasinif {
    public static void main(String[] args) {

    }
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(("Gişe Uygulamasına hoşgeldiniz"));
        System.out.print(("Lütfen TCKN numaranızı giriniz : "));
        String TCKN = kb.nextLine();
    }
}
