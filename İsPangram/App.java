package İsPangram;

    class App {
        public static void main(String [] args)
        {
            IsPangramTest.run();
        }
    }

    class IsPangramTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);

            IsPangramTRTest.run(kb);
            IsPangramENTest.run(kb);
        }
    }

    class IsPangramENTest {
        public static void run(java.util.Scanner kb)
        {
            for (;;) {
                System.out.print("Input a text:");
                String s = kb.nextLine();

                if ("quit".equals(s))
                    break;

                System.out.println(StringUtil.isPangramEN(s) ? "Pangram" : "Not a Pangram");
            }
        }
    }

    class IsPangramTRTest {
        public static void run(java.util.Scanner kb)
        {
            for (;;) {
                System.out.print("Bir yazı giriniz:");
                String s = kb.nextLine();

                if ("elma".equals(s))
                    break;

                System.out.println(StringUtil.isPangramTR(s) ? "Pangram" : "Pangram değil");
            }
        }
    }

    class StringUtil
    {
        public static boolean ispangram(String s, String alphabet)
    {
        int len = alphabet.length();
        for (int i = 0 ; i < len ; ++i )
          if(!s.contains(alphabet.charAt(i) + ""))
              return false;

       return true ;
    }
        public static boolean isPangramEN(String s)
        {
            return ispangram(s.toLowerCase(),"abcdefghijklmnopqrstuvwxyz");
        }

        public static boolean isPangramTR(String s)
        {
            return ispangram(s.toLowerCase(),"abcçdefgğhiıjklmnoöprsştuüvyz");
        }

    }
