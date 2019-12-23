package com.lv465.chapters;

import java.util.ArrayList;
import java.util.List;

public class Chapter1 {
    private static int test;

    int getNumberOfDigits1(Integer number) {
        return number.toString().length();
    }

    int getNumberOfDigits2(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    int getNumberOfDigits3(int number) {
        return (int) (Math.log10(number) + 1);
    }

    int getSumOfDigits(int number) {
        int sumOfDigits = 0;
        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }

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

    List<Integer> getPerfectNumbers(int number) {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            if (isPerfect(i)) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

}
