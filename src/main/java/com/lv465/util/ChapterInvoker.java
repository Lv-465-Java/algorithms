package com.lv465.util;


import com.lv465.chapter.Chapter1;
import com.lv465.chapter.Chapter2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ChapterInvoker {
    /**
     * Initialization of logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ChapterInvoker.class);
    /**
     * Object of Chapter1 class used for calling its methods
     */
    private Chapter1 chapter1;
    /**
     * Object of Chapter2 class used for calling its methods
     */
    private Chapter2 chapter2;
    /**
     * Object of ScannerImplementation class to use its methods
     */
    private Scannable scanner = new ScannerImplementation();

    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;

    public ChapterInvoker() {
        chapter1 = new Chapter1();
        chapter2 = new Chapter2();
        menu = new LinkedHashMap<>();
        menu.put("1", "  1 - check if number square contains three");
        menu.put("2", "  2 - reverse Entered Number");
        menu.put("3", "  3 - number With The BiggestSum");
        menu.put("4", "  4 - number Of Digits1");
        menu.put("5", "  5 - number Of Digits2");
        menu.put("6", "  6 - number Of Digits3");
        menu.put("7", "  7 - sum Of Digits in number");
        menu.put("8", "  8 - perfect Numbers");
        menu.put("9", "  9 - sum of last digits");
        menu.put("10", "  10 - all common multiple for two numbers");
        menu.put("11", "  11 - mertens numbers");
        menu.put("12","  12 - amount of squares of even numbers");
        menu.put("13","  13 - amount of numbers multiple on 3, not 5");
        menu.put("14","  14 - Pythagoras triples");
        menu.put("15","  15 - get smallest number of 2^r which greater than given number");
        menu.put("16","  16 - get three numbers whose sum of a squares equals to given number, if it is possible");
        menu.put("17","  17 - all pairs of three numbers whose sum of squares equals to a given number, if it is possible");
        menu.put("18", "18 - get maximum number in which 4^k < n");
        menu.put("19", "19 - get all pairs of two numbers x, y in which n = x^2 + y^2, if it is possible");
        menu.put("20", "20 - get all pairs of two numbers x, y in which n = x^2 + y^2 and x >= y, if it is possible");
        menu.put("21"," 21 - replace first and last number");
        menu.put("22"," 22 - Add number One before and after value");
        menu.put("23"," 23 - get value with max sum of divisors");
        menu.put("Q", "  Q - exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::checkIfNumberSquareContainsThree);
        methodsMenu.put("2", this::reverseEnteredNumber);
        methodsMenu.put("3", this::numberWithTheBiggestSum);
        methodsMenu.put("4", this::numberOfDigits1);
        methodsMenu.put("5", this::numberOfDigits2);
        methodsMenu.put("6", this::numberOfDigits3);
        methodsMenu.put("7", this::getSumOfDigits);
        methodsMenu.put("8", this::getPerfectNumbers);
        methodsMenu.put("9", this::logSumOfLastDigits);
        methodsMenu.put("10", this::logAllCommonMultipleNumbers);
        methodsMenu.put("11", this::logMertensNumbers);
        methodsMenu.put("12", this::squareOfEvenNumber);
        methodsMenu.put("13", this::multipleOn3ButNot5);
        methodsMenu.put("14", this::PythagoreanTriplets);
        methodsMenu.put("15", this::getSmallestNumber);
        methodsMenu.put("16", this::getThreeNumbers);
        methodsMenu.put("17", this::getAllObjectsOfThreeNumbers);
        methodsMenu.put("18", this::getMaximumNumber);
        methodsMenu.put("19", this::getAllPairsNaturalNumbers1);
        methodsMenu.put("20", this::getAllPairsNaturalNumbers2);
        methodsMenu.put("21", this::replaceFirstAndLastNumber);
        methodsMenu.put("22", this::addOneBeforAndAfterValue);
        methodsMenu.put("23", this::getValueWithMaxSumDivisors);
    }

    /**
     * Method for logging whether entered number square contains number three
     *
     * @author Halina Yatseniuk
     */
    private void checkIfNumberSquareContainsThree() {
        try {
            LOG.info("Number square contains three - " + chapter1.numberSquareContainsThree
                    (scanner.enterNumber()));
        } catch (InputMismatchException e) {
            LOG.info("Wrong input type");
        }
    }

    /**
     * Method that logs result of reversing an entered number
     *
     * @author Halina Yatseniuk
     */
    private void reverseEnteredNumber() {
        try {
            LOG.info("Reversed version of entered number - " + chapter1.reverseNumber
                    (scanner.enterNumber()));
        } catch (InputMismatchException e) {
            LOG.info("Wrong input type");
        }
    }

    /**
     * Method for logging of an natural number with the biggest sum of all dividers
     *
     * @author Halina Yatseniuk
     */
    private void numberWithTheBiggestSum() {
        Map.Entry<Integer, Integer> entry = chapter2.findNumberWithMaxSumOfDividers
                (chapter2.generateIntStreamFromOneToTenThousand());
        LOG.info("Number with the biggest sum is " + entry.getKey() + " with a sum of all dividers - " + entry.getValue());
    }

    /**
     * Method for logging of number of digits1 in number
     *
     * @author Andrii Bren
     */
    private void numberOfDigits1() {
        LOG.info("Number of Digits1 in number: " + chapter1.getNumberOfDigits1(scanner.enterNumber()));
    }

    /**
     * Method for logging of number of digits2 in number
     *
     * @author Andrii Bren
     */
    private void numberOfDigits2() {
        LOG.info("Number of Digits2 in number: " + chapter1.getNumberOfDigits2(scanner.enterNumber()));
    }

    /**
     * Method for logging of number of digits3 in number
     *
     * @author Andrii Bren
     */
    private void numberOfDigits3() {
        LOG.info("Number of Digits3 in number: " + chapter1.getNumberOfDigits3(scanner.enterNumber()));
    }

    /**
     * Method for logging of sum of digits in number
     *
     * @author Andrii Bren
     */
    private void getSumOfDigits() {
        LOG.info("Sum of Digits in number: " + chapter1.getSumOfDigits(scanner.enterNumber()));
    }

    /**
     * Method for logging of perfect numbers
     *
     * @author Andrii Bren
     */
    private void getPerfectNumbers() {
        LOG.info("Perfects numbers: " + chapter1.getPerfectNumbers(scanner.enterNumber()));
    }
    /**
     * Method for logging amount of natural numbers
     * that are square of even numbers
     *
     * @author Maria Shchur
     */
    private void squareOfEvenNumber(){
        int number = scanner.enterNumber();
        LOG.info("Amount of numbers from 1 to " + number +" that are square of even number = "
                +chapter1.getSquareOfEvenNumber(number));
    }

    /**
     * Method for logging amount of natural numbers
     * multiple on 3 but not 5
     *
     * @author Maria Shchur
     */
    private void multipleOn3ButNot5(){
        int number = scanner.enterNumber();
        LOG.info("Amount of numbers from 1 to " + number +" that multiple on 3 but not 5 = "
                +chapter1.getMultipleOn3ButNot5(number));
    }

    /**
     * Method for logging all Pythagoras triples
     *
     * @author Maria Shchur
     */
    private void PythagoreanTriplets(){
        LOG.info("Pythagorean triplets : " + chapter2.getPythagoreanTriplets(scanner.enterNumber()));
    }

    /**
     * Method for logging sum of last number of digits of input number.
     *
     * @author Artur Sydor
     */
    private void logSumOfLastDigits() {
        int number = scanner.enterNumber();
        int numberOfDigits = scanner.enterNumber();
        LOG.info("Sum of last " + numberOfDigits + " digits of number "
                + number + " - " + chapter1.sumOfLastDigits(number, numberOfDigits));
    }

    /**
     * Method for logging all common multiples for two number.
     *
     * @author Atrur Sydor
     */
    private void logAllCommonMultipleNumbers() {
        int firstNumber = scanner.enterNumber();
        int secondNumber = scanner.enterNumber();
        LOG.info("List of all common multiple " + chapter2.findAllCommonMultipleNumbers(firstNumber, secondNumber)
        + " for numbers:" + firstNumber + ", " + secondNumber);
    }

    /**
     * Method for logging mertens numbers.
     *
     * @author Artur Sydor
     */
    private void logMertensNumbers() {
        int number = scanner.enterNumber();
        LOG.info("List of all mertens numbers " + chapter2.findMertensNumbers(number) +
                 " smaller than " + number);
    }

    /**
     * Method for logging the smallest number of 2^r which is greater than given number
     *
     * @author Maryana Kravets
     */
    private void getSmallestNumber() {
        int number=scanner.enterNaturalNumber();
        LOG.info("The smallest number of 2^r which greater than "+ number+" is: " +
                chapter1.getSmallestNumberGreaterThanGivenNumber(number));
    }

    /**
     * Method for logging three numbers whose sum of squares equals to a given number.
     *
     * @author Maryana Kravets
     */
    private void getThreeNumbers(){
        int number = scanner.enterNaturalNumber();
        if(chapter1.getThreeNaturalNumbers(number).size()==0){
            LOG.info("This natural number can't be represented as a sum of squares of three number!");
        } else {
        LOG.info("Three number whose sum of squares equals to a given number "+ 
                + number + " are:  " + chapter1.getThreeNaturalNumbers(number));
        }
    }

    /**
     * Method for logging all pair of three numbers whose sum of squares equals to a given number.
     *
     * @author Maryana Kravets
     */
    private void getAllObjectsOfThreeNumbers() {
        int number = scanner.enterNaturalNumber();
        if(chapter1.getThreeNaturalNumbers(number).size()==0){
            LOG.info("This natural number can't be represented as a sum of squares of three number!");
        } else {
            LOG.info("All pair of three numbers whose sum of squares equals to a given number are: "
                    + chapter1.getAllPairOfThreeNumber(number));
        }
    }
    /**
     * Method for logging the maximum integer k  in which 4^k < n.
     *
     * @author Marian Dutchyn
     */
    private void getMaximumNumber(){
        int number = scanner.enterNaturalNumber();
        LOG.info("The maximum number in which 4^k < n is " + chapter1.getMaximumNumber(number));
    }

    /**
     * Method for logging all pair of two numbers x, y in which n = x^2 + y^2.
     *
     * @author Marian Dutchyn
     */
    private void getAllPairsNaturalNumbers1(){
        int number = scanner.enterNaturalNumber();
        if (chapter2.getAllPairsNaturalNumbers1(number).size() <= 0){
            LOG.info("This natural number can't be represented as a sum of squares of two numbers!");
        } else {
            LOG.info("All pair of two numbers whose sum of squares equals to a given number are:"
            + chapter2.getAllPairsNaturalNumbers1(number));
        }
    }

    /**
     * Method for logging all pair of two numbers x, y in which n = x^2 + y^2 and x >= y
     *
     * @author Marian Dutchyn
     */
    private void getAllPairsNaturalNumbers2(){
        int number = scanner.enterNaturalNumber();
        if (chapter2.getAllPairsNaturalNumbers2(number).size() <= 0){
            LOG.info("This natural number can't be represented as a sum of squares of two numbers!");
        } else {
            LOG.info("All pair of two numbers whose sum of squares equals to a given number are:"
                    + chapter2.getAllPairsNaturalNumbers2(number));
        }
    }

    /**
     * Method for logging value with replaced first and last number
     *
     * @author Ivan Syniuk
     */
    private void replaceFirstAndLastNumber(){
        int number = scanner.enterNaturalNumber();
        LOG.info("Replaced value is :" + chapter1.replaceFristAndLastNumber(number) );
    }

    /**
     * Method for logging value with added number one before and after value
     *
     * @author Ivan Syniuk
     */
    private void addOneBeforAndAfterValue(){
        int number = scanner.enterNaturalNumber();
        LOG.info("Value with number One before and after value : " + chapter1.addOneBeforeAndAfterNumber(number));
    }

    /**
     * Method for logging value with max sum of divisors
     *
     * @author Ivan Syniuk
     */
    private void getValueWithMaxSumDivisors(){
        LOG.info("Value with max sum of divisors : " + chapter2.getValueWithMaxSumOfDivisors());
    }

    /**
     * Method for outputting the menu points
     *
     * @author Andrii Bren
     */
    private void outputMenu() {
        LOG.info("\nMENU:");
        for (String str : menu.values()) {
            LOG.info(str);
        }
    }

    /**
     * Method for displaying menu
     *
     * @author Andrii Bren
     */
    public void show() {
        String keyMenu;
        do {
            outputMenu();
            keyMenu = scanner.enterMenuPoint().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }
        } while (!keyMenu.equals("Q"));
    }
}