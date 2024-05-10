package PadLeadingTrailingTest;


import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
      padLeadingTrailing.run();
    }
}
class padLeadingTrailing
{
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;)
        {
            System.out.println("Bir yazı giriniz");
            String s = kb.nextLine();

            if ("elma".equals(s))
                break;
            System.out.println("Bir sayi giriniz");
            int count = Integer.parseInt(kb.nextLine());
            System.out.printf("(%s)%n", StringUtil.padLeading(s, count, 'x'));
            System.out.printf("(%s)%n", StringUtil.padLeading(s, count));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, count, 'x'));
            System.out.printf("(%s)%n", StringUtil.padTrailing(s, count));

        }
    }
}
class StringUtil
    {
    public static String padLeading(String s, int len)
    {
        return padLeading(s,len,' ');
    }

    public static String padLeading(String s, int len, char ch)
    {
        int length = s.length();

        return len == length ? "" : (ch+"").repeat(len-length) + s ;
    }

    public static String padTrailing(String s, int len)
    {
        return padTrailing(s,len,' ');
    }

    public static String padTrailing(String s, int len, char ch)
    {
        int length = s.length();

        return len == length ? "" : s + (ch+"").repeat(len-length);

    }


    }