package domowe;

import java.util.Arrays;
import java.util.Scanner;

public class IntToBin {
    int intMax = Integer.MAX_VALUE;
    private int a;
    private int[] binaryNumber;
    private int[] revBinaryNumber;

    public static void main(String[] args) {
        IntToBin intToBin = new IntToBin();
        intToBin.pobierzLiczbeDoZmiany();
        intToBin.wyznaczReszteDzielenia();
        intToBin.wypiszWynik();
        System.out.println(Arrays.toString(intToBin.revBinaryNumber));

    }

    private void wyznaczReszteDzielenia() {
        int pobranaLiczba = a;
        int modulo;
        binaryNumber = new int[5]; // za cholere nie wiem jak
        for (int i = 0; i < 31; i++) {

            if (pobranaLiczba == 0) {
                return;
            } else {
                modulo = pobranaLiczba % 2;
                pobranaLiczba = a / 2;
                binaryNumber[i] = modulo;
                a = pobranaLiczba;
            }
        }

    }

    private void wypiszWynik() {
        revBinaryNumber = new int[binaryNumber.length];
        for (int i = binaryNumber.length; i > 0; i--) {
            revBinaryNumber[i - 1] = binaryNumber[binaryNumber.length - i];
        }
    }

    private void pobierzLiczbeDoZmiany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę do zmiany na kod binary");
        a = scanner.nextInt();
        System.out.println("pobrana liczba to a: " + a);
    }
}
