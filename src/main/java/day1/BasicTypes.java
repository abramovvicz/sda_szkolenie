package day1;

public class BasicTypes {

    //private int zmienna  - zmienna tylko dla klasy
    //public int zmienna  - zmienna widoczna wszędzie
    //protected int zmienna - zmienna widoczna w pakiecie, wktórym jesteśmy i klasach potomnych
    //default int zmienna - bez określania -
    //w klasie należy ustawiać atrybuty zmienne
    // w metodzie tylko typ zmiennej

    //zmienna stała final z DUŻYCH LITER




    static int zmiennaKlasy;

    public static void main(String[] args) {


        zakresType();
        method3();

        //wrapery - odpowiedniki obiektowe zmiennych podstawowych klasa osłonowa  typy obiektowe!

        Boolean aNewBoolean = true;
//      aNewBoolean = newBoolean;

        Byte bNewByte;


    }

    public static void zakresType() {

        boolean newBoolean = true; // or false;
        boolean booleanTrue = Boolean.TRUE;
        boolean booleanFalse = Boolean.FALSE;

        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        byte newByte = 2; //zmienne całkowite

        short newShort = 3; //zmienne całkowite
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        int newInt = 4; //zmienne całkowite
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;

        long newLong = 5L; //zmienne całkowite
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;


        float newFloat = 6.0F;
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        double newDouble = 7.0D; //zmienna zmiennoprzecinkowa
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        char newChar = '8'; //znak
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;

        System.out.println("booleanTrue " + booleanTrue);
        System.out.println("booleanFalse " + booleanFalse);

        System.out.println("byteMin " + byteMin);
        System.out.println("byteMax " + byteMax);

        System.out.println("shortMin " + shortMin);
        System.out.println("shortMax " + shortMax);

        System.out.println("intMin " + intMin);
        System.out.println("intMax " + intMax);

        System.out.println("longMin " + longMin);
        System.out.println("longMax " + longMax);

        System.out.println("floatMin " + floatMin);
        System.out.println("floatMax " + floatMax);

        System.out.println("doubleMin " + doubleMin);
        System.out.println("doubleMax " + doubleMax);
        method2();

    }


    public static void method2() {
        //konwersja typów
        double c = 1.0;
        int d = (int) c; // to jest ta konwersja
        System.out.println("d rowne = " +  d);

        long longMax = 9223372036854775807L; // na końcu L żeby Java się nie plumkała
        int longNumber = 1_000_000; // od Java 8 można tak zapisywać długie liczby
    }


    public static void method3() {

        int a = 7;
        int b = 5;

        System.out.println(a == b); //zwraca booleana
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);
        System.out.println(a % b); //parsowąć - zmieniać typa
    }

    public void someMethod() {
        int a = 5;
    }




    public static void method4()
    {

        int a = 7;
        int b = a;

        b = b + 5;

        System.out.println(a);
        System.out.println(b);
    }

}
