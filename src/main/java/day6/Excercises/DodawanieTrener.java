package day6.Excercises;

public class DodawanieTrener {
    public static void main(String[] args) {
        System.out.println(dodaj(2, 5));
        palindrom3("kajak");
        palindrom3("jakiś tekst ");
    }

    private static int dodaj(int a, int b) {
//        return Integer.sum(a, b);
        while (b-- > 0) {//o tyle ile zmniejszy b o tyle zwiększy a
            a++;
        }
        return a;
    }

    private static void palindrom(String text) {
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        char[] tablica = text.toCharArray();
        boolean test = true;
        int length = text.length();

        for (int i = 0; i < length; i++) {
            if (tablica[i] != tablica[length - i - 1]) {
                System.out.println("to nie jest palindromem");
                return;
            }
        }
        System.out.println("to jest palindrom");
    }

    private static void palindrom2(String text) {
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        char[] tablica = text.toCharArray();
        int last = text.length() - 1;
        int first = 0;
        while (last > first) {
            if (tablica[last--] != tablica[first++]) {
                System.out.println("to nie jest palindromem");
                return;
            }
        }
        System.out.println("to jest palindrom");

    }

    private static void palindrom3(String tekst) {
        tekst = tekst.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(tekst);
        String result = stringBuilder.reverse().toString();
        if(tekst.equalsIgnoreCase(result)){
            System.out.println("jest palindromem");
        }else{
            System.out.println("nie jest palindromem");
        }


    }
}
