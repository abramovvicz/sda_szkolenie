package day2.std;

public class DynamicStatic {

    public DynamicStatic() {//musi się nazywać dokładnie jak klasa
        //konstruktor klasy nawet jak go nie wypiszemy to java go domyslnie dopisze
        //konsturkorze można zrobić parametry klasy

        System.out.println("konstruktor klasy DynamicStatic");

    }

    public static void main(String[] args) {
        DynamicStatic dynamicStatic = new DynamicStatic(); //
//        dynamicStatic.dynamicRun2(); //odwołujemy się do metody  poprzez obietk klasy w której jesteśmy
        dynamicStatic.staticRun();
    }

    public void dynamicRun() { //jakby była static to można ją wrzuać do maina metoda niestatyczna nie może być uruchamiana w mainie
        Pizza funghi = new Pizza();
        Pizza margerita = new Pizza();

        funghi.setName("Funghi");
        margerita.setName("Margerita");

        System.out.println(funghi.getName());
        System.out.println(margerita.getName());
    }


    public void dynamicRun2() { //jakby była static to można ją wrzuać do maina metoda niestatyczna nie może być uruchamiana w mainie
        Pizza funghi = new Pizza();
        System.out.println(funghi.getName());
    }

    public void staticRun() {
        Pizza funghi = new Pizza("pizza margerita");
        System.out.println(funghi.getName());


//        funghi.//nie da rady się dostać do statycznej zmiennej w Pizza classs
//        Pizza.staticName = "Funghi";
//        Pizza.staticName = "Margerita";
//        System.out.println(Pizza.staticName);

//zmienne statyczne są przechowywane od początku do końca programu - czyli zajmują pamięć
        //zmienne dynamiczne są sprzątane przez garbage collector - to jest ich plus

    }

}
