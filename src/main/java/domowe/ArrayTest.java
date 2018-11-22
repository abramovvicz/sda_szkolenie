package domowe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest {
    private int[] table1 = new int[6];

    public static void main(String[] args) {

        ArrayTest arrayTest = new ArrayTest();
        arrayTest.fillTable();
        arrayTest.write();
//        arrayTest.addNumber(88);
//        arrayTest.write(); //wypisanie jescze raz tablicy po dodaniu jakieś liczby
        Arrays.sort(arrayTest.table1);
        arrayTest.write();
        arrayTest.addNumberToIndex();
        arrayTest.write();
    }


    private void addNumberToIndex() {
        Scanner giveIndex = new Scanner(System.in);
        Scanner giveNumber = new Scanner(System.in);
        System.out.println("Enter index of the array: ");
        int tableIndex = giveIndex.nextInt();


        if (tableIndex > table1.length) {
            System.out.println("Table length is: " + table1.length + " \n you have exceeded the length of the board, give another index");
            return;
        } else {
            System.out.println("Enter number to add to table");
           int number = giveNumber.nextInt();
            int[] table2 = new int[table1.length + 1];
            for (int i = tableIndex; i < table2.length ; i++) {
                if (tableIndex==0 && i<table1.length){
                table2[i+1]=table1[i];
                }else
                {
                table2[i] = table1[i - 1];
                }
                for (int j = 0; j < table1.length; j++) {
                    if (table2[j] == 0) {
                        table2[j] = table1[j];
                    }

                }
            }
            table2[tableIndex] = number;
            table1 = table2;
        }

    }

    private void fillTable() {
        int max = 1000;
        Random random = new Random();
        for (int i = 0; i < table1.length; i++) {
            table1[i] = random.nextInt(max);

        }
    }

    //metoda ktorej podam dwa parametry index i cyfra  zabezpieczenie zeby nie wywalić poza index tablicy
    private void write() {

//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(tablica[i] + ",");
//        }

        System.out.println("tablica: " + Arrays.toString(table1));
    }

    private void addNumber(int a) {
//        int[] tablica2 = new int[tablica.length + 1];
//        for (int i = 0; i < tablica.length; i++) {
//            tablica2[i] = tablica[i];
//        }
        int[] tablica2 = Arrays.copyOf(table1, table1.length + 1);
        tablica2[tablica2.length - 1] = a;
        table1 = tablica2;
    }


    public void addNumber(int index, int liczba) {
        //TODO: napisać metodę dodającą liczbę do tablicy
    }


    private void testUtils() {
//        Arrays.
    }
}
