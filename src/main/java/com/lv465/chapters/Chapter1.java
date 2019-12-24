package com.lv465.chapters;

import java.util.Arrays;

public class Chapter1 {
    /**
     * Method calculates sum sum of last m digits of number n.
     *
     * @param n input number
     * @param m number of last digits of n
     * @return sum of last m digits of n
     * @author Artur Sydor
     */
    public Integer sumOfEndNumbers(int n, int m) {
        String number = new StringBuilder("" + n).reverse().toString();
        if (number.length() < m) {
            return -1;
        }
        Integer sumOfEnd = Arrays.stream(number.split(""))
                .filter(elem -> !elem.equals(""))
                .mapToInt(Integer::parseInt)
                .limit(m)
                .sum();
        return sumOfEnd;
    }

}
