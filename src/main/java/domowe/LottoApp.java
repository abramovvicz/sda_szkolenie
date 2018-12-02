package domowe;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoApp {

    private static boolean flag = false;
    private int[] table;
    private int[] tableUser;
    private String[] stringTable;
    private int max;

    public LottoApp(int quantityNumbers, int range) {
        if (range < quantityNumbers) {
            throw new IllegalArgumentException("Liczba range musi być mniejsza od quantintyNumbers");
        }

        /*do testowania */

//        table = new int[]{1, 2, 3, 4, 5, 6};

        /*end do testowania*/

        table = new int[quantityNumbers];
        this.max = range;

        tableUser = new int[quantityNumbers];
        stringTable = new String[quantityNumbers];


    }


    public static void main(String[] args) {

        try {
            LottoApp wynik = new LottoApp(6, 49);
            wynik.askForNumbers();
            Arrays.sort(wynik.tableUser);
            wynik.changeToIntAndCheckNumbers();
            if (!flag) {
                wynik.chooseNumbers();
                Arrays.sort(wynik.table);
                wynik.compare();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Podałeś błędne paratmery");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Podałeś za mało liczb, podaj 6 liczb");
        } finally {
            System.out.println("sekcja finaly");
        }

    }


    private void askForNumbers() {
        System.out.println("Witaj w dzisiejszym losowaniu Lotto, może to Ty dzisiaj wygrasz? \n Podaj proszę 6 liczb po przecinku od 1 do 49 i wciśnij Enter");
        Scanner scanner = new Scanner(System.in);
        String userNumbers = scanner.nextLine();
        stringTable = new String[table.length];
        stringTable = userNumbers.split(",", 6);
        tableUser = new int[stringTable.length];
    }



    private void changeToIntAndCheckNumbers() {
        for (int i = 0; i < tableUser.length; i++) {
            tableUser[i] = Integer.parseInt(stringTable[i]);
            if (tableUser[i] >= 50) {
                System.out.println("podałes złe liczby podaj jeszcze raz");
                flag = true;
                break;
            }
            for (int j = 0; j < tableUser.length; j++) {
                if (i != j) {
                    if (tableUser[i] == tableUser[j]) {
                        System.out.println("podałeś dwie takie same liczby");
                        flag = true;
                        break;
                    }
                }
            }
        }
    }

    private void compare() {
        int counter = -1;

        for (int i = 0; i < tableUser.length; i++) {
            for (int j = 0; j < tableUser.length; j++) {
                if (tableUser[i] == table[j]) {
                    counter++;
                }
            }

        }
        System.out.println("Twoje wytypowane liczby: " + Arrays.toString(tableUser));
        System.out.println("Wyniki dzisiejszego losowania: " + Arrays.toString(table));

        switch (counter) {
            case 0:
                System.out.println("trafiłeś jedną liczbę");
                break;
            case 1:
                System.out.println("trafiłeś dwie liczby");
                break;
            case 2:
                System.out.println("trafiłeś trzy liczby");
                break;
            case 3:
                System.out.println("trafiłeś cztery liczby");
                break;
            case 4:
                System.out.println("trafiłeś pięć liczb");
                break;
            case 5:
                System.out.println("trafiłeś sześć liczb");
                break;
            default:
                System.out.println("nie trafiłeś rzadnej liczby");
                break;

        }
    }


    private void chooseNumbers() {
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            int a = random.nextInt(max) + 1;

            if (checkExistRandomNumbers(a)) {
                i--;
            } else {
                table[i] = a;
            }

        }
    }

    private boolean checkExistRandomNumbers(int a) {

        for (int b : table) {   // for each
            if (b == a) {
                return true;
            }
        }
        return false;

    }

}

