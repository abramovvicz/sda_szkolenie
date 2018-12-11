package day6;

import java.util.*;

public class Kolekcje {
    //list - przechowuje w kolejnosći, posiada kolejność, nie musimy znać wielkości listy, mogą być powtarzalne elementny, można
    //iterować po indexie, pamieta indexy od 0 do max wartości, możemy się odwołać po indexie, przechowuje tylko OBIEKTY

    //set - worek do, które coś się wrzuca, nie przechowuje powtórzonych elementów - dwa takie same elementy nie moga występować,
    // odrazu sortuje

    //mapa - trochę nie jest kolekcją, to jest co przechowuje dwie wartości, klucz i wartość, każdy element musi mieć swój
    //klucz i wartość  klucze to zachowują się jak  set, w mapie nie jest przechowywana kolejność

    List<String> list = new ArrayList<>(); // deklaracja listy można podać w konstruktorze wielkość czyli w nawiasach


    public Kolekcje() {
        list.add("Pawel");
        list.add("Damian");
        list.add("Michał");
        list.add("Jakub");
        list.add("Jakub");
        list.add("Piotr");


    }

    public static void main(String[] args) {
        Kolekcje kolekcje = new Kolekcje();
        kolekcje.addElement(0, "Sławek");
        kolekcje.removeElement(1);
//        while (kolekcje.list.contains("Jakub")) {
//            kolekcje.removeElement("Jakub");
//        }
//        kolekcje.sortElements();
//        Collections.addAll( ) dodawanie jednej listy do drugiej
//        Collections.asLifoQueue( ) zwaraca last input first output
//        Collections.copy(); kopiowanie listy
//        kolekcje.testElement("Ewelina");
//        kolekcje.testList4();
//        System.out.println(kolekcje.list);
//        kolekcje.createSet();
//        kolekcje.setNames();
//        kolekcje.mapTest();
        kolekcje.mapTest2();

    }

    private void setNames() {
        List<Name> names = new ArrayList<>();
        names.add(new Name(21, "Adam", "Nowak"));
        names.add(new Name(22, "Bartosz", "Abramowicz"));
        names.add(new Name(23, "Nati", "Diesel"));
        names.add(new Name(23, "Adam", "Nowak"));
        names.add(new Name(24, "Jan", "Kowalski"));
        for (Name a : names) {
            if (a.getId() == 22) {  //sprawdzamy po id czy jakieś występuje, id jest zadeklarowane w klasie Name
                System.out.println(a);
            }
        }
//        Set<Name> namesSet = new TreeSet<>(names);
//        System.out.println(names); to nie zadziała bo byśmy musieli w klasie name
//        stworzyć metode, która pokazała nby jak porównywanć obiekty Name bo Java tylko potrafi porówynywać Stringi


    }


    //MAP
    private void mapTest2() {
        Map<Integer, Name> map = new HashMap<>();
        map.put(1, new Name(21, "Adam", "Nowak"));
        map.put(2, new Name(22, "Bartosz", "Abramowicz"));
        map.put(3, new Name(23, "Nati", "Diesel"));
        map.put(4, new Name(23, "Adam", "Nowak"));
        map.put(5, new Name(24, "Jan", "Kowalski"));
        Name name = map.get(4);
        System.out.println(name);
    }


    private void mapTest() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Paweł");
        map.put(2, "Iwona");
        map.put(3, "Tomek");
        map.put(4, "Michał");
        map.put(5, "Jakub");
        System.out.println(map.get(3));

    }


    //SET
    private void createSet() {
//        Set<String> setString = new TreeSet<>(list); //odrazu sortuje
        Set<String> setString = new HashSet<>(list); //losowo wrzuca nowe elementy
        System.out.println(setString);
        for (String s : setString) {
            if (s.equals("Jakub")) {
                System.out.println(s);
            }
        }
    }



    //LIST
    private void testElement(String element) {
        char[] a = element.toCharArray();
        Character[] b = new Character[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        List<Character> list = Arrays.asList(b); //tak tworzona lista jest niezmienna nie mozna do niej dodwac lub odejmować elementy tzn
        //mozna zmieniać wszystko ale nie można zmieniać size()
        //aby to obejść trzeba stwotrzyć kopię takiej listy
        List<Character> listCopy = new ArrayList<>(list); // kopiowanie listy
        listCopy.add('d');
//        list.sort(Character::compareTo);
        System.out.println(list);
        System.out.println(listCopy);
    }

    private void sortElements() {
        list.sort(String::compareTo);
    }

    private void addElement(int index, String element) {
//        list.add( ) //bez parametru index, jak poniżej, dodaje element jako ostatni
        list.add(index, element);
    }

    private void removeElement(int index) {
        list.remove(index);
    }

    private void removeElement(String element) {
        list.remove(element);
    }

    private void testList() {
        for (int i = 0; i < list.size(); i++) {

//            System.out.println(list.get(i));
            System.out.printf("Element %d wartość %s%s \n", i, list.get(i), list.size() - 1 == i ? "." : ",");
        }
        //tryby generyczne
    }

    private void testList2() {
        for (String a : list) {
            System.out.printf("Elementd wartość %s\n", a);

        }
    }

    private void testList3() {  // lamba
        list.forEach(System.out::println);
    }

    private void testList4() {  // lamba + programowanie funkcyjne
        list.forEach(x -> System.out.printf("Elementd wartość %s\n", x));
    }
}
