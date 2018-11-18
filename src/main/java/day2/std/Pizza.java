package day2.std;

public class Pizza {


    public static String staticName; //zmienna statyczna
    private String name; // zmienna dynamiczna

    public Pizza(){
        //kontruktor bez parametrów sam się Tworzy automaytcznie
    }

    public Pizza(String name) {
        //konstruktor;
        this.name = name;
    }
    //enkapsulacja

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        //this //zmienna klasy a nie zmiennej metody
    }
}
