package domowe;

import java.util.Random;

public class Lotto {
    int table[] = new int[6];
    int table2[] = new int[6];

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.chooseNumbers();
        lotto.checkNumbers();
    }

    //    table[0] = 4;
//    table[1] = 5;
//    table[2] = 2;
//    table[3] = 6;
//    table[4] = 6;
//    table[5] = 6;
    private void chooseNumbers() {
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(48) + 1;
            table2[i] = table[i];
        }

    }

    private void checkNumbers() {
        System.out.println("    ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table2.length; j++) {
                if (i != j) {
                    if (table[i] == table2[j]) {
                        chooseNumbers();
                    }

                }
            }
            System.out.println("Prędzej wygram w totka niż zostanę programistą? Sprawdźmy to!: " + table[i]);
        }
    }
}

