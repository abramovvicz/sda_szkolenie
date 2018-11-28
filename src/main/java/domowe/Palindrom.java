package domowe;

public class Palindrom {
    public static void main(String[] args) {
        String a = checkPalindrom("kajak");
        String b = checkPalindrom("Kobyła ma mały bok");
        String c = checkPalindrom("kobyła coś tam robi");
//        System.out.println(a.equals("kajak") ? "ok" : "błąd");
//        System.out.println(b.equals("Kobyła ma mały bok") ? "ok" : "błąd");
//        System.out.println(c.equals("kobyła coś tam robi") ? "ok" : "błąd");

    }

    private static String checkPalindrom(String a) {
        String result = a.replaceAll(" ", "").toLowerCase();
        String[] table = result.split("");
        String[] table2 = new String[table.length];
        for (int i = table.length; i > 0; i--) {
            table2[table.length - i] = table[i - 1];
        }

        String check = String.join("", table2);
        if (check.equals(result)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return result;
    }
}
