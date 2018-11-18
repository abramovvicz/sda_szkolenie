package day2;

public class ShortIf {
    public static void main(String[] args) {
       // int a = 8;
     //   System.out.println(a > 8 ? "Jest większe od 8" : "jest mniejsze lub równe  8");
//        bad(a > 3 ? "a" : "b");

        switchTest(null);

    }

    private static boolean check(int a) {
        /*if (a>8){
            return true;
        }else{
            return  false;
        }*/
        //ten sam zapis
        return a > 8;

    }

    private static void bad(String a) {
        if (a.equals("b")) {
            System.out.println("wynik jest false");
        } else {
            System.out.println("wynik jest true");
        }
    }


    private static void method1() {
        int a = 8;
        String res = "";
        if (a > 8) {
            res = "jest większe od 8 ";
        } else {
            res = "jest mniejsze od 8 ";
        }

        System.out.println("stary zapis " + res);
        System.out.println(a > 8 ? "jest większe od8" : "jest niejsze od 8");
    }


    private static void switchTest(String name) {
        if (name == null || name.equals("")) {
            System.out.println("warunek spełniony");
            return;
        }

        switch (name) {
            case "dom":
                System.out.println("to jest dom");
                break;
            case "szopa":
                System.out.println("to jest szopa");
                break;
                default:
                    System.out.println("metoda default  ");
        }
        if (name.equals("dom")) {
            System.out.println("to jest dom");
        }
    }
}

