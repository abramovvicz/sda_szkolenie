package day3;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.print("Witaj " + new ScannerTest().get());  // stworzenie obiektu anonimowego tylko raz
    }

    private String get() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz swoje imie: ");
        String res = scanner.nextLine();
        System.out.print("podaj wiek: ");
        int age = scanner.nextInt();
        return "witaj " + res + " wiek " + age;
    }
}
