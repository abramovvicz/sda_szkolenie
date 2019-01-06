package day6;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.test2());
//        System.out.println(stringTest.test());
    }

    private String test() {
        String model = "%s ma %d %s %.8f";
        String a = "Ala";
        int lat = 2;
        System.out.printf(model, a, lat, lat < 4 ? "lata" : "lat", Math.PI);
        return "";
    }

    private String test2() {
        String model = "%2s %s %d %s %.2f";
        //%10s cyfra wskazuje na rezerwowana długośc string
        //%.2f cyfrewa wskazuje na zaokrąglenie liczby do 2 miejsc po przecinku
        String a = "Ala";
        String ma = "ma";
        int wiek = 2;
        String result = String.format(model, a, ma, wiek, wiek < 4 ? "lata" : "lat", Math.PI);
        return result;
    }
}
