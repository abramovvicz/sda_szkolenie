package day1;

public class Methods {

    public static void method1() {
        System.out.println("Printout z method1");
    }

    public static void method2(String name) {
        System.out.println("Name z method2 " + name);
    }


    public static void method3(int a, int b) {
        System.out.println("a+b " + (a + b));
    }

    public static int method4(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        method1();
        method2("Jarek");
        method3(3, 5);
        int result = method4(5,6);
        System.out.println("result " + result);


    }

}
