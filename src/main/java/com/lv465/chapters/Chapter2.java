package com.lv465.chapters;

import com.lv465.util.NumberWrapper;

import java.util.ArrayList;
import java.util.List;

public class Chapter2 {

    /**
     * This method returns list of natural numbers
     * if it can be represent as n = x^2 + y^2
     *
     * @param n natural number
     * @return list of natural numbers
     * @author Marian Dutchyn
     */
    public List<NumberWrapper> getNaturalNumberSequenceA(int n) {
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
    public static List<NumberWrapper> getNaturalNumberSequenceB(int n) {
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


}
