package lottery.input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * this class is responsible for reading numbers form the user
 */
public class UserInputReader {

    private final Scanner scanner;

    public UserInputReader(InputStream inputStream) {
         this.scanner = new Scanner(inputStream);
    }
    int readNumbers(){ //TODO write test
        return scanner.nextInt();
    }
    void close(){
        scanner.close();
    }

}
