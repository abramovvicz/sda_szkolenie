package day1;

public class Calculator {

    static int a = 5; //deklaracja zmiennych klasy!!!
    static int b = 6; //deklaracja zmiennych klasy!!!

    //ta metoda jest bardziej prawidłowa gdzie każda metoda robi jedną rzecz
    public static int sum() { // wtedy nie potrzeba dodawać argumentów do klasy bo jest return
        return a + b;
    }

    public static int substraction() {
        return a - b;
    }

    public static int multiplitaction() {
        return a * b;
    }

    public static double division() {
        double c = (double)a/b;
        return c;
    }

    public static void main(String[] args) {
//        int a =6;
//        int b = 5; mogłem jeszcze tak zadeklarować zmienną ale wtedy ona jest widoczna tylko dla methody main i wtedy
        //nalezy korzystać z methody(argument, argument);
        int resultSum = sum();
        System.out.println("suma " + resultSum);
        int resultSubstraction = substraction();
        System.out.println("różnica " + resultSubstraction);
        int resultMultiplication = multiplitaction();
        System.out.println("mnożenie " + resultMultiplication);
        double resultDivision = division();
        System.out.println("dzielenie " +  resultDivision);


    }

}

