package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatLetters {
    public static void main(String[] args) {
//        System.out.println(countNumberOfLetters("ubkfmdjxyzlbgkrotcepvswaqx\n"));
//        outPutMap1(countNumberOfLetters("kajak"));
        outPutMap2(countNumberOfLetters("abba"));
    }

    private static void outPutMap1(Map<Character, Integer> map) {
        Set<Character> result = map.keySet(); // keySet - tworzy set z samych kluczy czyli wyciąganie kluczy z mapy
        //set musi mieć takie same wartosci jak mapa -
        for (Character c : result) {
            System.out.println("klucz " + c + " wartość " + map.get(c)); //
        }

    }

    private static void outPutMap2(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {   // Mp.Entry klasa, która posiada klucz i wartość
            //mapa przechowuje obiekty
            System.out.println("Klucz  " + entry.getKey() + " wartość " + entry.getValue());

        }
    }

    private static Map<Character, Integer> countNumberOfLetters(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char s = text.charAt(i);
            if (map.get(s) == null) {
                map.put(s, 1);
            } else {
                //int liczbaWystapein = map.get(s);
                map.put(s, map.get(s) + 1); // PUT nadpisuje poprzednią wartość
                //dzięki mapie mamy dynamiczne tworzenie zmiennych (można dodawać juz do elementów kolejne elementy
            }
            //przerobić na krótki if
        }
        return map;
    }

}
