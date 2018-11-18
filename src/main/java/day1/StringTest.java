package day1;

public class StringTest {
    public static void main(String[] args) {
        String newString = "some string";

        String a = "Dom";
        String b = "Dom";
        String c = new String("Dom"); //tworzenie w nowej alokacji pamięci

        // a==b; // true  nigdy nie porównujemy stringów za pomoca znaczka == to jest tylko zapis z tablicy
        // a==c; // false   inna lokacja pamięci

        System.out.println("a == b " + (a == b)); //true
        System.out.println("a == c " + (a == c));//false - nie porównujemy przez == obiekty
        System.out.println("equals a = b " + (a.equals(b)));  //true
        System.out.println("equals a = c " + (a.equals(c)));  //true

        String d = "Ala ma ";
        String e = "kota";
        String f = d + e;

        System.out.println(f);

        String h = "Kot ma ";
        h = h + "Alę";
        System.out.println(h);


    }
}

//może pojawić się na rozmowie kwalifikacyjne
