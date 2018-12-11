package day4;

import java.util.Arrays;

public class TableInsert {
    private int[] table = {1, 2, 3, 4, 5, 6, 7};

    private int[][] tabalicaDwuwymiarowa = {{1, 2, 3, 7, 8, 9}, {4, 6, 7,}, {7, 8, 9, 10, 11, 12}, {0}};

    public static void main(String[] args) {
        TableInsert tableInsert = new TableInsert();
//        tableInsert.wypiszTablice();
//        tableInsert.wypiszTabliceForEarch();
        //tableInsert.metodaPrzyjmujacaWieleArgumentow(1, 3, 4, 5, 6, 6, 8, 5, 3);
        System.out.println(Arrays.toString(tableInsert.table));
        tableInsert.insert1(5, 10);
        System.out.println(Arrays.toString(tableInsert.table));
    }


    private void insert(int index, int value) {//im mniej zadeklarowanych zmiennych tym lepiej
        int[] copyTable = new int[table.length + 1];
        // ma być dłuższa o jeden
        int j = 0;
        for (int i = 0; i < copyTable.length; i++) {
            if (i == index) {
                copyTable[i] = value;
                i++;
            }
            copyTable[i] = table[j];
            j++;
        }
        table = copyTable;
    }

    private void insert1(int index, int value) {//im mniej zadeklarowanych zmiennych tym lepiej
        int[] copyTable = new int[table.length + 1];
        // ma być dłuższa o jeden
        int j = 0;
        for (int i = 0; i < table.length; i++) {
            copyTable[i + ((i < index) ? 0 : 1)] = table[i];// zajebiste
        }
        copyTable[index] = value;
        table = copyTable;
    }

    private void insert2(int index, int value) {//im mniej zadeklarowanych zmiennych tym lepiej
        int[] copyTable = Arrays.copyOf(table, table.length+1);
        for (int i = copyTable.length - 1; i > index; i--) {
            copyTable[i] = copyTable[i - 1];
        }
        copyTable[index] = value;
        table = copyTable;

    }

    //
    private void metodaPrzyjmujacaWieleArgumentow(int... a) { //nie można podać dwóch takich parametrów, można robić tak zżę (String a, int ...a)
        for (int b : a) {
            System.out.println(b);
        }


    }

//    void foo(String...args){} //prawidłowe
//    void foo2(String a, String...args){} //ruchoma liczba argumentów może być tylko raz
//
//    void ff(){
//
//        foo2("",1,2,3)}

    private void wypiszTablice() {
        for (int i = 0; i < tabalicaDwuwymiarowa.length; i++) {
            for (int j = 0; j < tabalicaDwuwymiarowa[i].length; j++) { //ciekawy zapis bo trzeba się iterować po druich tablicach

                System.out.print(tabalicaDwuwymiarowa[i][j] + ", ");
            }
            System.out.println();
        }
    }


    private void wypiszTabliceForEarch() {
        for (int[] a : tabalicaDwuwymiarowa) { // iterujemy się po indexach tablicy !!
            for (int b : a) { // iterujemy się po elementach w tablicy tablic
                System.out.print(b + ",");
            }

            System.out.println();
        }
    }


//    fori (int i=0, j =0, i<10 || j<10; i++,j++); można tak łączyć

}
