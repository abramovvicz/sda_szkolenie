package day2;

public class Loops {
    public static void main(String[] args) {

        pytanie2();
    }


    static void method1() {
        String a = "Ala ma kota a kot ma ale";
        String[] tab = a.split(" ");

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }


    }

    static void method2() {

        String a = "Ala";
        a += " ma kota";

        //można tak łączyć stringi
        System.out.println(a);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");


//        i = i+2 można zapisać i+=2;
        }
    }

    public static void method3() {
        int i = 0; // pierwszy warunel
//        for (; i < 8; ) {
//            i++;
//            System.out.println(i + " ");
//        }


        for (; ; ) {
            System.out.println(i + " ");
            if (i == 8) { //2 warunek
                break;
            }
            i++; //trzeci argument inkrementacja

        }

    }

    public static void method4() {
        for (int i = 8; i > 0; i--) {
            System.out.print(i);
        }
    }


    public static void method5() {
        int a = 0;
        while (a < 8) {
            System.out.println(a + "");
            a++;
        }
        System.out.println("koniec pętli");
    }

    public static void method6() {
        //do while - wykonuje się zawsze raz;
        int a = 9;
        do{
            System.out.println(a + "");
            a++;
        }while (a < 8);
        System.out.println("koniec pętli");
    }

    public static void pytanie() {
        int a = 5;
        System.out.println("a " + a++); //5
        System.out.println(a);//6
        System.out.println("a " + ++a);//7
        System.out.println(a);//7
        System.out.println("a " + a--);//7
        System.out.println(a);//6
        System.out.println("a " + --a);//5
    }
    public static void pytanie2() {
        int a = 6;
        boolean c = a >10;

        System.out.println(c ? ">" : "<");

    }

    public boolean pytanie3(String s){
        return s.equals("Dom");
        //if działa tylko dla booleana
    }
}
