package lv465.algoritm.utils;

import lv465.algoritm.chapter.Chapter1;
import lv465.algoritm.chapter.Chapter2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Map;

public class ChapterInvoker {
    /**
     * Initialization of logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ChapterInvoker.class);
    /**
     * Object of Chapter1 class used for calling its methods
     */
    private Chapter1 chapter1 = new Chapter1();
    /**
     * Object of Chapter2 class used for calling its methods
     */
    private Chapter2 chapter2 = new Chapter2();
    /**
     * Object of ScannerImplementation class to use its methods
     */
    private ScannerImplementation scannerImplementation = new ScannerImplementation();

    /**
     * Method for logging whether entered number contains number three
     *
     * @author Halina Yatseniuk
     */
    public void checkIfNumberContainsThree() {
        try {
            LOG.info("Number contains three - " + chapter1.numberContainsThree
                    (scannerImplementation.enterNumber()));
        } catch (InputMismatchException e) {
            LOG.info("Wrong input type");
        }
    }

    /**
     * Method that logs result of reversing an entered number
     *
     * @author Halina Yatseniuk
     */
    public void reverseEnteredNumber() {
        try {
            LOG.info("Reversed version of entered number - " + chapter1.reverseNumber
                    (scannerImplementation.enterNumber()));
        } catch (InputMismatchException e) {
            LOG.info("Wrong input type");
        }
    }

    /**
     * Method for logging of an natural number with the biggest sum of all dividers
     *
     * @author Halina Yatseniuk
     */
    public void numberWithTheBiggestSum() {
        Map.Entry<Integer, Integer> entry = chapter2.findNumberWithMaxSumOfDividers
                (chapter2.generateIntStreamFromOneToTenThousand());
        LOG.info("Number is " + entry.getKey() + " with a sum of all dividers - " + entry.getValue());
    }
}