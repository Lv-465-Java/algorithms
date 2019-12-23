package lv465.algoritm.chapter;

import lv465.algoritm.util.Reader;
import lv465.algoritm.util.ReaderImpl;

import java.util.*;
import java.util.logging.Logger;

public class Chapter1 {


    private static Logger logger = Logger.getLogger(Chapter1.class.getName());
    private Scanner scanner = new Scanner(System.in);
    private Reader reader = new ReaderImpl(scanner);
    private List<Integer> list = new ArrayList<>();
    private List<List<Integer>> listList = new ArrayList<>();
    private boolean flag = false;
    private int number;

    public Integer sumOfEndNumbers(int n, int m) {
        String number = new StringBuilder("" + n).reverse().toString();
        if (number.length() < m) {
            return 0;
        }
        Integer sumOfEnd = Arrays.stream(number.split(""))
                .filter(elem -> !elem.equals(""))
                .mapToInt(Integer::parseInt)
                .limit(m)
                .sum();
        return sumOfEnd;
    }

    /**
     * The function finds the smallest number of 2^r which is greater than given number
     *
     * @return number
     */

    public int getSmallestNumberGreaterThanGivenNumber() {
        logger.info("Enter a natural number:");
        try {
            number = reader.read();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }
        int i = 0;

        while (number != 0 & number != 1) {
            number /= 2;
            i++;
        }
        double d = Math.pow(2, i + 1);
        logger.info("The smallest number of 2^r is ");
        return (int) d;
    }


    /**
     * The function verifies whether a given number can be represented as a sum of a square of three numbers
     *
     * @return list of three numbers
     */

    public List<Integer> getThreeNumber() {
        logger.info("Enter a natural number");
        boolean flag = false;

        try {
            number = reader.read();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        list.addAll(Arrays.asList(i, j, k));
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            logger.info("This natural number can't be represented " +
                    "as a sum of squares of three number!");
        }
        return list;
    }


    /**
     * The function finds all pairs of three numbers whose sum of squares equals to a given number
     * * @return list of all pairs of three numbers
     */

    public List<List<Integer>> getAllPairOfThreeNumber() {
        logger.info("Enter a natural number");
        try {
            number = reader.read();
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= number - i * i; j++) {
                for (int k = 1; k <= number - i * i - j * j; k++) {
                    if (number == i * i + j * j + k * k) {
                        listList.add(Arrays.asList(i, j, k));
                        flag = true;
                    }
                }
            }
        }
        if (!flag) {
            logger.info("This natural number can't be represented " +
                    "as a sum of squares of three number!");
        }
        return listList;
    }

}
