package domowe;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    private int[] tablica = new int[6];

    public static void main(String[] args) {

        ArrayTest arrayTest = new ArrayTest();
        arrayTest.fillTable();
        arrayTest.write();
        arrayTest.addNumber(88);
        arrayTest.write(); //wypisanie jescze raz tablicy po dodaniu jakieś liczby
        Arrays.sort(arrayTest.tablica);
        arrayTest.write();
    }

    private void fillTable() {
        int max = 1000;
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
           tablica[i] = random.nextInt(max);

//        jeśli  liczba z tablicy jest rowna kolejnej wylosowanej to losój jeszcze raz


//        System.out.println(numbersTable[i]);
        }
    }

//metoda ktorej podam dwa parametry index i cyfra  zabezpieczenie zeby nie wywalić poza index tablicy
    private void write() {

//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(tablica[i] + ",");
//        }

        System.out.println(Arrays.toString(tablica));
    }

    private void addNumber(int a) {
//        int[] tablica2 = new int[tablica.length + 1];
//        for (int i = 0; i < tablica.length; i++) {
//            tablica2[i] = tablica[i];
//        }
        int[] tablica2 = Arrays.copyOf(tablica, tablica.length+1);
        tablica2[tablica2.length - 1] = a;
        tablica = tablica2;
    }


    public void addNumber(int index, int liczba){
        //TODO: napisać tablicę dodającą liczbę do tablicy
    }



    private void testUtils(){
//        Arrays.
    }
}
