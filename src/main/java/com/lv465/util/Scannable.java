package com.lv465.util;

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
     * Method, that reads entered input number from console and
     * checks whether it is natural
     *
     * @return int natural value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    int enterNaturalNumber() throws InputMismatchException;

    /**
     * Method, that reads entered input string from console
     *
     * @return string value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    String enterString() throws InputMismatchException;

    String enterMenuPoint() throws InputMismatchException;
}