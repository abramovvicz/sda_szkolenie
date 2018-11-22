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


    private void chooseNumbers() {
        Random random = new Random();

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(49) + 1;


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

