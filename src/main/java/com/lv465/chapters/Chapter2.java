package com.lv465.chapters;

import java.util.ArrayList;
import java.util.List;

public class Chapter2 {
    public List<Integer> allCommonMultipleNumbers(int n, int m) {
        if (n <= m) {
            return findMultiple(n, m);
        } else {
            return findMultiple(m, n);
        }
    }

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

    private boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

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
