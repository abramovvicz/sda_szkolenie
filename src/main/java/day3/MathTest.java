package day3;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        MathTest mathTest = new MathTest(); //stworzyliśmy obiekt klasy MathTest
        mathTest.test();  //wywołanie metody test obiketu mathTest klasy MathTest
    }

    private void test() {

        Random random = new Random();
        int s = random.nextInt(900)+100;// zmiana zakresu od 100 do 1000 - poprostu dodaje się do początku czyli 0+100 to 100
        // 100+900 = 1000 czyli zakres 100-1000;
        System.out.println(s);
    }


 //zrobić program do losowania LOTTO; permutacja bez powtórzeń




}
