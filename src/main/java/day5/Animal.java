package day5;

import java.io.Serializable;

public class Animal  implements Serializable { //TODO: poczytać o tym interfejs rzecz o któ®ej trzeba pamiętać
    //nalezy pamie†ąc, że jak obiekt się zmieni to trzeba tez zmienić w wywoływaniu plików te zmiany
    private String kolor;
    private String rodzaj;
    private String imie;
    //zmienne klasy muszą być prywatne

    //ctrł + enter tworzenie kostrutora

    public Animal(String kolor, String rodzaj, String imie) {
        this.kolor = kolor;
        this.rodzaj = rodzaj;
        this.imie = imie;
    }

    @Override// metoda toString ma override
    //metode to string uzywa sie do porownywania obiektow
    public String toString() {
        return "Animal{" +
                "kolor='" + kolor + '\'' +
                ", rodzaj='" + rodzaj + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
