package com.lv465.chapters;

import java.util.ArrayList;
import java.util.List;

public class Chapter2 {
    /**
     * Method finds all common multiple of numbers n and m,
     * which are smaller than n*m.
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
     * Method finds multiple numbers for smaller and bigger.
     *
     * @param smaller number
     * @param bigger number
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
     * Method finds mertens numbers smaller than n.
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
     * Method checks if number is prime.
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
     * Method checks if number is mertens.
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
