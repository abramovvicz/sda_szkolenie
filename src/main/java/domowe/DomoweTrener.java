package domowe;

public class Domowe_Trener {
    public static void main(String[] args) {
        divide(7,5);
    }

    static String divide(int a, int b) {
        String result = "";
        if (b == 0) {
            result = "Dzielenie przez zero ";
        } else {
            int calkowita = a / b;
            int licznik = a % b;
            if (licznik == 0) {
                result = "" + calkowita;
            } else {
                return calkowita + " " + licznik + "/" + b;
            }


            return result;


    }

}