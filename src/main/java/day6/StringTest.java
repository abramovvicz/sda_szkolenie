package day6;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.test2());
    }

    private void test() {
        String model = "%s ma %d %s %.2f";
        String a = "Ala";
        int lat = 2;
        System.out.printf(model, a, lat, lat < 4 ? "lata" : "lat", Math.PI);
    }

    private String test2() {
        String model = "%2s ma %10d %s %.2f";
        //%10s cyfra wskazuje na rezerwowana długośc string
        //%.2f cyfrewa wskazuje na zaokrąglenie liczby do 2 miejsc po przecinku
        String a = "Ala";
        int lat = 2;
        String result = String.format(model, a, lat, lat < 4 ? "lata" : "lat", Math.PI);
        return result;
    }
}
