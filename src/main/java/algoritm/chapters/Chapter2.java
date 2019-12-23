package algoritm.chapters;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Chapter2 {

    /**
     * Method for determining a natural number with the biggest sum of all dividers
     *
     * @return Map.Entry<Integer, Integer> where key is natural number and value is the biggest sum of its dividers
     * @author Halina Yatseniuk
     */
    public Map.Entry<Integer, Integer> findNumberWithMaxSumOfDividers(IntStream stream) {
        return stream.boxed()
                .map(x -> calculateSumOfDividers(x))
                .flatMap(x -> x.entrySet().stream())
                .max(Map.Entry.comparingByValue()).get();
    }

    /**
     * Method to calculate a sum of all dividers of a natural number
     *
     * @param number natural number to calculate a sum of its dividers
     * @return Map<Integer, Integer> where value is a natural number and key is a sum of its dividers
     * @author Halina Yatseniuk
     */
    private Map<Integer, Integer> calculateSumOfDividers(int number) {
        int sum = 0;
        HashMap<Integer, Integer> pair = new HashMap<>();
        for (int j = 1; j < 10000; j++) {
            if (number % j == 0) {
                sum += j;
            }
        }
        pair.put(number, sum);
        return pair;
    }

    /**
     * Method for generating sequential IntStream in range from 1 to 10000
     *
     * @return IntStream from 1 to 10000 int elements
     * @author Halina Yatseniuk
     */
    public IntStream generateIntStreamFromOneToTenThousand() {
        return IntStream.range(1, 10000);
    }
}