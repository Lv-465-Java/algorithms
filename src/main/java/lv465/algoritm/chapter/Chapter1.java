package lv465.algoritm.chapter;

import java.util.Arrays;

public class Chapter1 {

    public Integer sumOfEndNumbers(int n, int m) {
        String number = new StringBuilder("" + n).reverse().toString();
        if (number.length() < m) {
            return 0;
        }
        Integer sumOfEnd = Arrays.stream(number.split(""))
                .filter(elem -> !elem.equals(""))
                .mapToInt(Integer::parseInt)
                .limit(m)
                .sum();
        return sumOfEnd;
    }
}
