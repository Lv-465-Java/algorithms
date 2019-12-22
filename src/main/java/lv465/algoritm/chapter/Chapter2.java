package lv465.algoritm.chapter;

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
}
