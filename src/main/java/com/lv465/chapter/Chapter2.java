package com.lv465.chapter;

import com.lv465.util.NumberWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
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
    public List<Integer> findAllCommonMultipleNumbers(int n, int m) {
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

    /**
     * This method return all the Pythagoras triples
     * of natural numbers, each number does not exceed limit number
     *
     * @param limit number is read by Scanner
     * @return  List<List<Integer>> - list of Pythagoras triples
     * @author Maria Shchur
     */
    public List<List<Integer>> getPythagoreanTriplets(int limit){
        int m=2;
        int a,b,c;
        List<List<Integer>> resultlist = new ArrayList<>();
        while (m<limit){
            for( int n=1;n<m;n++){
                a=m*m-n*n;
                b=2*m*n;
                c=m*m+n*n;
                if (c>limit)
                    break;
                resultlist.add(Arrays.asList(a,b,c));
            }
            m++;
        }
        return resultlist;
    }

    /**
     * This method returns list of natural numbers
     * if it can be represent as n = x^2 + y^2
     *
     * @param n natural number
     * @return list of natural numbers
     * @author Marian Dutchyn
     */
    public List<NumberWrapper> getAllPairsNaturalNumbers1(int n) {
        List<NumberWrapper> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == Math.round(Math.pow(i, 2) + Math.pow(j, 2))) {
                    result.add(new NumberWrapper(n, i, j));
                }
            }
        }
        return result;
    }

    /**
     * This method returns list of natural numbers
     * if it can be represent as n = x^2 + y^2 and x >= y
     *
     * @param n natural number
     * @return list of natural numbers
     * @author Marian Dutchyn
     */
    public static List<NumberWrapper> getAllPairsNaturalNumbers2(int n) {
        List<NumberWrapper> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == Math.round(Math.pow(i, 2) + Math.pow(j, 2)) && i >= j) {
                    result.add(new NumberWrapper(n, i, j));
                }
            }
        }
        return result;
    }

    /**
     * This method returns the value with the max sum of divisors
     * @author Ivan Syniuk
     * @return integer value
     */
    public int getValueWithMaxSumOfDivisors() {
        int sum = 0;
        int maxValue = 0;
        for (int i = 1; i < 10000; i++) {
            int currentSum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    currentSum += j;
                }
            }
            if (currentSum > sum) {
                sum = currentSum;
                maxValue = i;
            }
        }
        return maxValue;
    }
}