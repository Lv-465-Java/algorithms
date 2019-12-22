package lv465.algoritm.chapter;

import java.util.ArrayList;
import java.util.List;

public class Chapter3 {
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
