package day7.wyjatki;

public class Exceptions {
    public static void main(String[] args) {
        try {
            method(60);
        } catch (OwnException e) {
            System.err.println("nasz własny wyjątek");
            System.out.println(e.getMessage());
            e.printStackTrace(); // ppokazuje wszystkie informacje na temat błędu
        } catch (IllegalArgumentException e) {
            System.out.println("i cant be less then zero");

        } catch (Exception e) {
            System.out.println("Some another exceptions");
        }
        //w catchach musi być zachowana hierrarchia = exceprtion jest najwyżej więc jakby illegarl argument było po exception
        //wywaliło by bła∂
        finally {
            System.out.println("finalny blok");
        }
    }


    private static void method(int i) throws OwnException { //metoda musi własny throws
        if (i < 0) {
            throw new IllegalArgumentException("I cant be less then zero"); //throw kończy działanie metody jak return
        } else if (i > 50) {
            throw new OwnException("Own exception, I powinno być większe niz 50");
        }
        System.out.println(i + " jest ok ");
    }
}
