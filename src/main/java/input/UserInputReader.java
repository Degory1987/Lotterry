package input;

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
    int readNumber(){ //TODO write test
        System.out.println("Give number: ");
        return scanner.nextInt();
    }
    void close(){
        scanner.close();
    }

}
