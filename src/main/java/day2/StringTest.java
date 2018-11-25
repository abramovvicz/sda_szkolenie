package day2;

public class StringTest {
    public static void main(String[] args) {
        method();
        method1();
    }

    private static void method() {
        String a = null; //to jest null bo nie został zainicjowany
        String b = "";

//        a.equals(b); //dlatego tu jest błąd
        b.equals(a);

    }
    private static void method1() {
        String a = "Ala ma kota";
        String[] table = a.split(" "); //dzieli stringi
        System.out.println(table[0]);
        System.out.println(table[1]);
        System.out.println(table[2]);
    }
}
