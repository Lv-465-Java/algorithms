package com.lv465.chapter;

import com.lv465.util.NaturalWrapper;
import com.lv465.util.PerfectNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Chapter1 {

    /**
     * Method for matching whether entered number square contains number three
     *
     * @param num number read by Scanner
     * @return boolean value of containing number three
     * @author Halina Yatseniuk
     */
    public boolean numberSquareContainsThree(int num) {
        return Stream.of(num)
                .map(i -> i * i)
                .map(Objects::toString)
                .allMatch(m -> m.contains("3"));
    }

    /**
     * Method for reversing entered number
     *
     * @param num number read by Scanner
     * @return StringBuilder value of reversed string
     * @author Halina Yatseniuk
     */
    public StringBuilder reverseNumber(int num) {
        return new StringBuilder(((Integer) num).toString()).reverse();
    }

    /**
     * This method convert given number to string
     * and get number of digits.
     *
     * @param number value which input user.
     * @return integer value length of string.
     * @author Andrii Bren
     */
    public int getNumberOfDigits1(Integer number) {
        return number.toString().length();
    }

    /**
     * This method get number of digits in a given number.
     *
     * @param number value which input user.
     * @return integer value count
     * @author Andrii Bren
     */
    public int getNumberOfDigits2(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    /**
     * This method get number of digits in a given number
     * by counting log10 from given number.
     *
     * @param number value which input user.
     * @return integer value
     * @author Andrii Bren
     */
    public int getNumberOfDigits3(int number) {
        return (int) (Math.log10(number) + 1);
    }

    /**
     * This method get sum of digits in a given number.
     *
     * @param number value which input user.
     * @return integer value sumOfDigits
     * @author Andrii Bren
     */
    public int getSumOfDigits(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }

    /**
     * This method check whether sum of divisors
     * equals to number.
     *
     * @param number integer value.
     * @return boolean value.
     * @author Andrii Bren
     */
    private boolean isPerfect(int number) {
        int sumOfDivisors = 1;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                if (i * i != number) {
                    sumOfDivisors = sumOfDivisors + i + number / i;
                } else {
                    sumOfDivisors += 1;
                }
            }
        }
        return sumOfDivisors == number;
    }

    /**
     * This method get perfect numbers which
     * is less than given number.
     *
     * @param number value which input user.
     * @return list of PerfectNumber with perfect numbers.
     * @author Andrii Bren
     */
    public List<PerfectNumber> getPerfectNumbers(int number) {
        List<PerfectNumber> perfectNumbers = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(new PerfectNumber(i));
            }
        }
        return perfectNumbers;
    }


    /**
     * Method calculates sum sum of last m digits of natural number n.
     *
     * @param n input number
     * @param m number of last digits of n
     * @return sum of last m digits of n
     * @author Artur Sydor
     */
    public Integer sumOfLastDigits(int n, int m) {
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
    /**
     * Method for returning amount of natural numbers
     * that are square of even numbers
     *
     * @param max_number number is read by Scanner
     * @return long value - amount of numbers
     * @author Maria Shchur
     */
    public long getSquareOfEvenNumber(int max_number){
        return IntStream.
                rangeClosed(1,max_number).
                filter(q->(Math.sqrt(q)%2==0)).
                count();
    }

    /**
     * This method return amount of natural numbers
     * multiple on 3 but not 5
     *
     * @param max_number number is read by Scanner
     * @return long value - amount of numbers
     * @author Maria Shchur
     */
    public long getMultipleOn3ButNot5(int max_number){
        return IntStream.
                rangeClosed(1,max_number).
                filter(q->(q%3==0 && q%5!=0)).
                count();
    }

    /**
     * The method finds the smallest number of 2^r which is greater than given number
     * @param number >=1 which input user
     * @return integer value
     * @author Kravets Maryana
     */

    public int getSmallestNumberGreaterThanGivenNumber(int number) {
        int i = 0;

        while (number != 0 & number != 1) {
            number /= 2;
            i++;
        }
        double d = Math.pow(2, i + 1);
        return (int) d;
    }

    /**
     * The method verifies whether a given number can be represented as a sum of a square of three numbers
     * @param  number>=1 which input user
     * @return list of three numbers
     * @author Kravets Maryana
     */

    public List<Integer> getThreeNaturalNumbers(int number) {
        List<Integer> list=new ArrayList<>();
        boolean flag = false;

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        list.addAll(Arrays.asList(i, j, k));
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
//        if (!flag) {
//            logger.info("This natural number can't be represented " +
//                    "as a sum of squares of three number!");
//        }
        return list;
    }

    /**
     * The method finds all pairs of three numbers whose sum of squares equals to a given number
     *   @param  number>=1 which input user
     *   @return list of all objects of three numbers
     *   @author Kravets Maryana
     */

    public List<NaturalWrapper> getAllPairOfThreeNumber(int number) {
        List<NaturalWrapper> list =new ArrayList<>();
        boolean flag = false;

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        list.add(new NaturalWrapper(number,i,j,k));
                        flag = true;
                    }
                }
            }
        }
//        if (!flag) {
//            logger.info("This natural number can't be represented " +
//                    "as a sum of squares of three number!");
//        }
        return list;
    }

    /**
     *   This method returns the maximum integer k in which 4^k < n.
     *   @author Marian Dutchyn
     *   @param n an integer > 1
     *   @returns maximum integer in which 4^k < n
     */
    public int getMaximumNumber(int n){
        int k = 0;
        while (Math.pow(4,k) < n){
            k++;
        }
        return k;
    }
}
