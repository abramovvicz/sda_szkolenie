package day7.enums;

public enum Car {
    BMW("bóg mnie wybrał"),
    JAGUAR ("klasyka"),
    OPEL ("nie kupuj "),
    VW ("uszuści"),
    AUDI ("quattro rządzi");

    private String name;
    private  String tekst;

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void wypisz(){
        System.out.println("twój samochód to " + name);
    }
}
