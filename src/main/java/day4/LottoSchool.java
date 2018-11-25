package day4;

import java.util.Arrays;
import java.util.Random;

public class LottoSchool {
    private int[] table;
    private int max;

    public LottoSchool(int quantityNumbers, int range) {
        if (range<quantityNumbers){
            throw new IllegalArgumentException("Liczba range musi być mniejsza od quantintyNumbers");
        }
        table = new int[quantityNumbers];
        this.max = range; // this dotyczy zmiennych klasy czyli tych wyżej a max drugi to jest tej do konstruktora LottoSchoool, wpsolne dla obiekty Lotto


    }


    public static void main(String[] args) {
        try {
            LottoSchool wynik = new LottoSchool(6, 5);
            wynik.chooseNumbers();
            Arrays.sort(wynik.table);
            System.out.println(Arrays.toString(wynik.table));
        } catch (IllegalArgumentException e) {
            System.out.println("Podałeś błędne paratmery");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("sekcja finally");
        }

    }

    private void chooseNumbers() {
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            int a = random.nextInt(max) + 1;

            if (checkExist(a)) {
                i--;
            } else {
                table[i] = a;       // table[i] = table[i] - a; // to jest toższame z table[i]-=a;
            }

//            System.out.println(table[i]);
        }
    }

    private boolean checkExist(int a) {

        for (int b : table) {   // for each
            if (b == a) {
                return true;
            }
        }
        return false;
//        for (int i = 0; i < table.length; i++) {
//            if (table[i] == a) {
//                System.out.println("powtórzona cyfra " + a);
//                return true;
//            }
//        }
//        System.out.println("brak powtórzeń " + a);
//        return false;
    }
}
