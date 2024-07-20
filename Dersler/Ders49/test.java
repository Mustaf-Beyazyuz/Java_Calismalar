package Dersler.Ders49;

public class test {
    public static void main(String[] args) {
        System.out.printf("byte : [%d,%d] [%X,%X] %n ",Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short : [%d,%d] [%X,%X] %n ",Short.MIN_VALUE, Short.MAX_VALUE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("ınt : [%d,%d] [%X,%X] %n ",Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long : [%d,%d] [%X,%X] %n ",Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("double : [+-"+Double.MIN_VALUE+",+-"+Double.MAX_VALUE+"]");
        System.out.println("float : [+-"+Float.MIN_VALUE+",+-"+Float.MAX_VALUE+"]");
        System.out.printf("char : [%d,%d] %n ",(int)Character.MIN_VALUE, (int)Character.MAX_VALUE);

    }
}
