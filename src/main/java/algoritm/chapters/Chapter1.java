package algoritm.chapters;

import java.util.Objects;
import java.util.stream.Stream;

public class Chapter1 {

    /**
     * Method for matching whether entered number square contains number three
     *
     * @param num number read by Scanner
     * @return boolean value of containing number three
     * @author Halina Yatseniuk
     */
    public boolean numberSquareContainsThree(int num) {
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
}