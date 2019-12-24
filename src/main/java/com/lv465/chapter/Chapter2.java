package com.lv465.chapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Chapter2 {

    /**
     * Method for determining a natural number with the biggest sum of all dividers
     *
     * @return Map.Entry<Integer, Integer> where key is natural number and value is the biggest sum of its dividers
     * @author Halina Yatseniuk
     */
    public Map.Entry<Integer, Integer> findNumberWithMaxSumOfDividers(IntStream stream) {
        return stream.boxed()
                .map(x -> calculateSumOfDividers(x))
                .flatMap(x -> x.entrySet().stream())
                .max(Map.Entry.comparingByValue()).get();
    }

    /**
     * Method to calculate a sum of all dividers of a natural number
     *
     * @param number natural number to calculate a sum of its dividers
     * @return Map<Integer, Integer> where value is a natural number and key is a sum of its dividers
     * @author Halina Yatseniuk
     */
    private Map<Integer, Integer> calculateSumOfDividers(int number) {
        int sum = 0;
        HashMap<Integer, Integer> pair = new HashMap<>();
        for (int j = 1; j < 10000; j++) {
            if (number % j == 0) {
                sum += j;
            }
        }
        pair.put(number, sum);
        return pair;
    }

    /**
     * Method for generating sequential IntStream in range from 1 to 10000
     *
     * @return IntStream from 1 to 10000 int elements
     * @author Halina Yatseniuk
     */
    public IntStream generateIntStreamFromOneToTenThousand() {
        return IntStream.range(1, 10000);
    }

    /**
     * Method finds all common multiple of natural numbers n and m.
     *
     * @param n first input number
     * @param m second input number
     * @return list of all common multiple numbers smaller than n*m
     * @author Artur Sydor
     */
    public List<Integer> allCommonMultipleNumbers(int n, int m) {
        if (n <= m) {
            return findMultiple(n, m);
        } else {
            return findMultiple(m, n);
        }
    }

    /**
     * Method finds multiple numbers for smaller and bigger
     * which are smaller than smaller*bigger.
     *
     * @param smaller number
     * @param bigger  number
     * @return list of common multiples
     * @author Artur Sydor
     */
    private List<Integer> findMultiple(int smaller, int bigger) {
        int boundary = smaller * bigger;
        List<Integer> multiples = new ArrayList<>();
        for (int i = smaller; i > 0; i--) {
            if (smaller % i == 0 && bigger % i == 0 && i < boundary) {
                multiples.add(i);
            }
        }
        return multiples;
    }

    /**
     * Method finds mertens numbers smaller than natural number n.
     *
     * @param n boundary number
     * @return list of mertens numbers
     * @author Artur Sydor
     */
    public List<Integer> findMertensNumbers(int n) {
        List<Integer> mertonsList = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (isPrime(i)) {
                if (isMertens(i)) {
                    mertonsList.add(i);
                }
            }
        }
        return mertonsList;
    }

    /**
     * Method checks if natural number is prime.
     *
     * @param number which is checked
     * @return boolean result of checking number
     * @author Artur Sydor
     */
    private boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method checks if natural number is mertens.
     *
     * @param number which is checked for being mertens
     * @return boolean result checking number
     * @author Artur Sydor
     */
    private boolean isMertens(int number) {
        int mertensForm = 0;
        int power = 1;
        while (mertensForm <= number) {
            if (isPrime(power)) {
                mertensForm = (int) Math.pow(2, power);
                mertensForm -= 1;
                if (mertensForm == number) {
                    return true;
                }
            }
            power++;
        }
        return false;
    }
}