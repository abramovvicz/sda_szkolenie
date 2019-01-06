package day7.enums;

public enum Car {
    BMW("bóg mnie wybrał"),
    JAGUAR("klasyka"),
    OPEL("nie kupuj "),
    VW("oszuści"),
    AUDI("quattro rządzi");

    private String name;
    private String tekst;

     Car(String name) {
        this.name = name;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getName() {
        return name;
    }

    public void wypisz() {
        System.out.println("twój samochód to " + name);
    }
}
