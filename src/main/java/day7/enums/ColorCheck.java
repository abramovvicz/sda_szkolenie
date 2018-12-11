package day7.enums;


public class ColorCheck {

    public static void main(String[] args) {
        ColorCheck colorCheck = new ColorCheck();
//        System.out.println(colorCheck.singleColorCheck(Kolor.BLUE););
//        System.out.println(colorCheck.singleColorCheck(Kolor.RED););
//        System.out.println(colorCheck.singleColorCheck(Kolor.CYAN););
//        Kolor kolor = Kolor.RED;
//        colorCheck.colorChceck2(kolor);

        Car car = Car.BMW;
        colorCheck.carCheck(car);
        car.setTekst("tekst z obiektu car");
        Car car2 = Car.BMW;
        System.out.println(car2.getTekst());
        System.out.println(car == car2);

        car2.setTekst("to jest kolejny tekst");
        System.out.println(car.getTekst());

        //== porównuje miejsce w którym coś się znajduje

    }


    public void carCheck(Car car) {
        System.out.println(car.getName());
        car.wypisz();

        //ENUM z góry definiowanie poprzez klase zmiennych
    }

/*
    public void singleColorCheck(KolorSingle kolorSingle) {
        KolorSingle kolorSingle1 = KolorSingle.GREEN;
    }

    public String colorChceck2(Kolor kolor) {
        switch (kolor) {
            case RED:
                return “czerwony kolor”;
            case GREEN:
                return “zielony kolor”;
            case BLUE:
                return “niebieski kolor”;
            default:
                return “inny kolor”;
        }
    }

    public String colorChceck(Kolor kolor) {
        if (kolor == Kolor.RED) {
            return “Kolor RED”;
        }
        return “Nie czerwony”;
    }
*/
}