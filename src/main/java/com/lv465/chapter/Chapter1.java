package com.lv465.chapter;

import com.lv465.util.PerfectNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Chapter1 {

    /**
     * Method for matching whether entered number contains number three
     *
     * @param num number read by Scanner
     * @return boolean value of containing number
     * @author Halina Yatseniuk
     */
    public boolean numberContainsThree(int num) {
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
}
