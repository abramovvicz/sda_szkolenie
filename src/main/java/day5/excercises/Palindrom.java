package day5.excercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Palindrom {

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        System.out.println(palindrom.palindrom("Kobyła ma mały bok"));
        System.out.println(palindrom.palindrom("kajak"));
        System.out.println(palindrom.palindrom("dupa"));
    }

    private boolean palindrom(String inputText) {
        char[] charsTable;
        boolean result = true;

        inputText = inputText.toUpperCase().replaceAll("\\s", "");
        charsTable = inputText.toCharArray();

        for (int i = 0; i < inputText.length(); i++) {
            if (charsTable[i] != charsTable[inputText.length() - i - 1]) {
                result = false;
            }
        }
        return result;
    }
}
