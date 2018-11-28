package day5;

public class IntToBinTrener {
    public static void main(String[] args) {
        String a = intToBin(7);
        String b = intToBin(0);
        String c = intToBin(32);
        System.out.println(a.equals("111") ? "ok" : "błąd");
        System.out.println(b.equals("0") ? "ok" : "błąd");
        System.out.println(c.equals("100000") ? "ok" : "błąd");

    }

    private static String intToBin(int a) {
        String wynik = "";
        while (a > 0) {
//            if (a % 2 == 0) {
//                wynik = "0" + wynik;
//            } else {
//                wynik = "1" + wynik;
//            }

            wynik = (a%2) + wynik; // TODO: konwersja do strigna wystarczy dodać pustego stringa ZAPAMIĘTAć
            a = a / 2;
        }


        return wynik.equals("") ? "0" : wynik;
    }

}
