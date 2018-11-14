package day1;

public class NewCalculator {
    public static double count(int a, int b, String sign) {
        if (sign.equals("+")) {
            return a + b;
        } else if (sign.equals("-")) {
            return a - b;
        } else if (sign.equals("*")) {
            return a * b;
        } else if (sign.equals("/")) {
            return (double) a / b;
        } else {
            System.out.println("nieprawidłowy znak");
            return 0.0;
        }

    }

    public static double count1(int a, int b, String sign) {
        double result = 0.0;
        if (sign.equals("+")) {
            return a + b;
        } else if (sign.equals("-")) {
            return a - b;
        } else if (sign.equals("*")) {
            return a * b;
        } else if (sign.equals("/")) {
            return (double) a / b;
        } else {
            System.out.println("nieprawidłowy znak");
        }
        return result;


    }

    public static double count2(int a, int b, String sign) {
        double result = 0.0;
        switch (sign) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = (double) a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                System.out.println("nieprawidłowy znak");
                break;
        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(count(4, 3, "+"));
        System.out.println(count(4, 3, "-"));
        System.out.println(count(4, 3, "*"));
        System.out.println(count(4, 3, "/"));
        System.out.println(count(4, 3, "d"));
        System.out.println("***************************");
        System.out.println(count1(4, 3, "+"));
        System.out.println(count1(4, 3, "-"));
        System.out.println(count1(4, 3, "*"));
        System.out.println(count1(4, 3, "/"));
        System.out.println(count1(4, 3, "d"));
        System.out.println("***************************");
        System.out.println(count2(4, 3, "+"));
        System.out.println(count2(4, 3, "-"));
        System.out.println(count2(4, 3, "*"));
        System.out.println(count2(4, 3, "/"));
        System.out.println(count2(4, 3, "d"));

    }

}
