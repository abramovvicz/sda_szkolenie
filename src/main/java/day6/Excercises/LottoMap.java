package day6.Excercises;

import java.util.*;

public class LottoMap {

    public static void main(String[] args) {
        LottoMap lotto = new LottoMap();
//        System.out.println(lotto.lotto(6, 49));
        Set<Integer> userSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int i = lotto.checkNumber(userSet, lotto.lotto(6, 49));
        System.out.printf("trafiłeś %d %s", i, lotto.writeNumber(i));

    }

    private String writeNumber(int number) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "liczb");
        map.put(1, "liczbę");
        map.put(2, "liczby");
        map.put(3, "liczby");
        map.put(4, "liczby");
        map.put(5, "liczb");
        map.put(6, "liczb");
        return map.get(number);
    }

    private Set<Integer> lotto(int ileLiczb, int zIluLiczb) {
        Random r = new Random();
        Set<Integer> numbers = new TreeSet<>();
        //TreeSet od razu sortuje

        while (numbers.size() < ileLiczb) {

            numbers.add(r.nextInt(zIluLiczb) + 1);
        }
        System.out.println(numbers);
        return numbers;
    }

    private int checkNumber(Set<Integer> setOfUserNumbers, Set<Integer> randomNumbers) {
        int i = 0;
        for (Integer a : setOfUserNumbers) {
            if (randomNumbers.contains(a)) {
                i++;
            }
        }
        return i;
    }


}
