package lottery.input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * this class is responsible for reading input form the user
 */
public class UserInputReader {

    private final Scanner scanner;

    public UserInputReader(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    void close() {
        scanner.close();
    }

    String inputReader() {
        return scanner.next();
    }
}
