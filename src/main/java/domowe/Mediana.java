package domowe;

public class Mediana {

    public static void main(String[] args) {
        Mediana mediana = new Mediana();

        System.out.println(mediana.countMediana(new double[]{1, 4, 6, 9}));
        System.out.println(mediana.countMediana(new double[]{1}));
        System.out.println(mediana.countMediana(new double[]{}));
        System.out.println(mediana.countMediana(new double[]{1, 4, 6}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5, 6}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        System.out.println(mediana.countMediana(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));


    }

    private double countMediana(double[] doubles) {
        int doublesLength = doubles.length;
        double mediana = 0;
        if (doubles.length == 0) {
            mediana = 0;
            return mediana;
        }
        if (doublesLength % 2 == 0) {
            mediana = (doubles[doublesLength / 2 - 1] + doubles[doublesLength / 2]) / 2;
        } else {
            mediana = doubles[doublesLength / 2];
        }

        return mediana;
    }

}
