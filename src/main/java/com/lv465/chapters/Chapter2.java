package com.lv465.chapters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter2 {
    /**
     * This method return all the Pythagoras triples
     * of natural numbers, each number does not exceed limit number
     *
     * @param limit number is read by Scanner
     * @return  List<List<Integer>> - list of Pythagoras triples
     * @author Maria Shchur
     */
    public List<List<Integer>> pythagoreanTriplets(int limit){
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

}
