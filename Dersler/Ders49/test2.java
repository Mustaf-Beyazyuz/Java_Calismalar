package Dersler.Ders49;

// aouto boxing otomatik kutulama


public class test2 {
    public static void main(String[] args) {

        Object i= 10;
        Object a = 11;

        System.out.printf(i == a ? "aynı sayi":"farkli sayi");
        Double  b = 10.2;
        Float c = 10.2F;



        //aouto unboxing

        Integer d = 10;
        int val = d; //auto unboxing otomatik kutu açma
    }
}
