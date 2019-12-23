package algoritm.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerImplementation implements Scannable {
    /**
     * Initialization of logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ScannerImplementation.class);
    /**
     * Object of Scanner class used for reading inputs from console
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Method, that reads entered input number from console
     *
     * @return int value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    @Override
    public int enterNumber() throws InputMismatchException {
        LOG.info("Please, enter integer number");
        return scanner.nextInt();
    }

    /**
     * Method, that reads entered input string from console
     *
     * @return string value
     * @throws InputMismatchException
     * @author Halina Yatseniuk
     */
    @Override
    public String enterString() throws InputMismatchException {
        LOG.info("Please, enter string");
        return scanner.nextLine();
    }
}