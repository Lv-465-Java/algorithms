package com.lv465.chapters;

import com.lv465.util.NumberWrapper;

import java.util.ArrayList;
import java.util.List;

public class Chapter1 {

    /**
     *   This method returns the maximum integer k
     *   in which 4^k < n.
     *   @author Marian Dutchyn
     *   @param n an integer > 1
     *   @returns maximum integer in which 4^k < n
     */
    public int findMaxK(int n){
        int k = 0;
        while (Math.pow(4,k) < n){
            k++;
        }
        return k;
    }

    public static List<NumberWrapper> getNaturalNumberSequenceA(int n){
        List<NumberWrapper> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == Math.round(Math.pow(i,2) + Math.pow(j, 2))){
                    result.add(new NumberWrapper(n, i, j));
                }
            }
        }
        return result;
    }
}
