package com.lv465.chapters;

import java.util.stream.IntStream;

public class Chapter1 {
    /**
     * Method for returning amount of natural numbers
     * that are square of even numbers
     *
     * @param max_number number is read by Scanner
     * @return long value - amount of numbers
     * @author Maria Shchur
     */
    public long squareOfEvenNumber(int max_number){
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
    public long multipleOn3ButNot5(int max_number){
        return IntStream.
                rangeClosed(1,max_number).
                filter(q->(q%3==0 && q%5!=0)).
                count();
    }
}
