package domowe;

public class DomoweTrener {
    public static void main(String[] args) {
        System.out.println(divide3(40, -15));
        System.out.println(divide3(15, -15));
        System.out.println(divide3(10, -10));
        System.out.println(divide3(11, -15));
        System.out.println(divide3(-9, -15));

        long startNwd = System.currentTimeMillis();
        long stopNwd = System.currentTimeMillis();
        long stopNwd1 = System.currentTimeMillis();
        System.out.println("Metoda 1:" + (startNwd - stopNwd)); //srpawdzanie czasu wykonania metody
        System.out.println("Metoda 2:" + (stopNwd1 - stopNwd)); //srpawdzanie czasu wykonania metody


//        System.out.println(nwd1(5, 15) + "=5");
//        System.out.println(nwd1(6, 9) + "=3");
//        System.out.println(nwd1(15, 0) + "błą∂");
        //zabezpieczyć się z minusami
        //wprapery możn pokombinować
        //wymylślić metode ktora zamieni int na plus
//        Integer a  = -24;
//        System.out.println(a);
//        nwd(-40, 15);
    }

    static String divide(int a, int b) {
        String result = "";
        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;

            if (licznik == 0) {
                result = "" + calkowita;
            } else {
                int nwd = nwd(Math.abs(licznik), Math.abs(b));
                result = calkowita + " " + (licznik / nwd) + "/" + Math.abs(b / nwd);
            }
        }
        return result;
    }


    static String divide1(int a, int b) {
        //fajny trick
        boolean znak = true;
        if (a < 0) {
            a = a * (-1);
            znak = !znak; // podmiana znaku na false
        }
        if (b < 0) {
            b = b * (-1);
            znak = !znak; // podmiana znaku na false i taki trick że jeśli na górze jest false to tu będzie znowu true bo minus i minus daje plus
        }

        String result = znak ? "" : "-";
        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;
            if (licznik == 0) {
                result += "" + calkowita;
            } else {
                result += calkowita != 0 ? calkowita + result : "";
                int nwd = nwd(licznik, b);
                result += (licznik / nwd) + "/" + (b / nwd);
            }
        }
        return result;
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a==1 || b==1)
            {
                return 1;
            }
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;  ///można by wszystko jedno podać nawet b bo zwrócić musi albo to albo to
    }

    static String divide3(int a, int b) {
        //fajny trick
        String result = "";

        if (a * b < 0) {    //czyli, któraś  z nich jest ujemna
            result = "-";
            //max +1 daje min = przeskakiwanie maxymalnych wartości w intiger
        }


        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            result = "Błąd - dzielenie przez 0";
        } else {
            int calkowita = a / b;
            int licznik = a % b;
            if (licznik == 0) {
                result += "" + calkowita;
            } else {
                result += calkowita != 0 ? calkowita + " " : "";  //TODO:dokończyć
                int nwd = nwd(licznik, b);
                result += (licznik / nwd) + "/" + (b / nwd);
            }
        }
        return result;
    }

    private static int nwd1(int a, int b) {
        if (b == 0) {
            System.out.println("nie dziel przez zero");
            return -1;
        }

        int c;
        while (true) {
            c = a % b;  // modulo
            if (c == 0) {
                return b;
            }
            a = b;
            b = c;
        }
/*
*
* a   b
* c = a%b;
* c=0 -> b;
* c!=0;
* a=b;
* b=c;
*
*
* */


    }

}