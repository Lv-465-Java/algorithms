package lv465.algoritm.utils;

import java.util.InputMismatchException;

public interface Scannable {

    /**
     * Method, that reads entered input number from console
     *
     * @return int value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    int enterNumber() throws InputMismatchException;

    /**
     * Method, that reads entered input string from console
     *
     * @return string value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    String enterString() throws InputMismatchException;
}