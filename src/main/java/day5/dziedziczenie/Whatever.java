package day5.dziedziczenie;

public class Whatever {
    static { //najpierw sie wykonuje pole statyczne / dynaczmine // a potem konstruktor jako ostatni
        System.out.println("pole static");
    }


    {
        System.out.println("pole dynamic");
    }

    public Whatever() {
        System.out.println("konstruktor klasy ");

    }

    public static void main(String[] args) {
        new Whatever();
    }


}
