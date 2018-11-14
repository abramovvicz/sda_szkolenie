package domowe;

public class Domowe1 {
    public static void main(String[] args) {
/*
        System.out.println(divide(7, 5));
        System.out.println(divide(6, 5));
        System.out.println(divide(2, 8));
        System.out.println(divide(10, 5));

        System.out.println(divide(10, 0));
*/
        System.out.println(divide(5,15));
        System.out.println(divide(6,9));
    }

    static String divide(int i, int j) {
        if (j != 0) {

            int div = i / j;
            if (i % j == 0) {
                return "" + div;
            } else {
                if (i < j) {
                    if (i % 2 == 0 && j % 2 == 0) {
                        int div1 = i / i;
                        int div2 = j / i;
                        return ""  + div1 + "/" + div2;
                    }else
                    {

//TODO: tutaj jeszcze nalezy napisać a co jesli 5/15 czy 6/9?

                    }
                }
                int mod = i % j;
                return "" + div + " " + mod + "/" + j;

            }

        } else {
            System.out.println("probujesz dzielić przez Zero");
            return "";
        }


    }


}
