package domowe;

public class AnotherSum {


    public static void main(String[] args) {
        checkSum(2, 5);
        checkSum(19, 20);
        checkSum(8, 9);

    }

    private static int checkSum(int a, int b) {
        int a1 = -a;
        int b1 = b;

        int sum = (a1 - b1) * -1;
        System.out.println(sum);

        /* lub tak
        System.out.println(wynik.replaceAll("-", ""));
        String wynik = sum + "";
*/

        return sum;
    }

}