package input;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputReader {

    private final Scanner scanner;

    public UserInputReader(InputStream inputStream) {
         this.scanner = new Scanner(inputStream);
    }
    public int readNumber(){
        System.out.println("Give number: ");
        return scanner.nextInt();
    }
    public void close(){
        scanner.close();
    }

}
