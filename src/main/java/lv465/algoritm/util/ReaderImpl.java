package lv465.algoritm.util;

import java.util.Scanner;

public class ReaderImpl implements Reader {

    private Scanner scanner;

    public ReaderImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    public int read() {
        return scanner.nextInt();
    }
}
