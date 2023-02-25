import input.DataValidator;
import input.UserInputReader;
import input.UserNumberDeliverer;
import input.UserNumberStorage;

import java.util.Set;


public class Main {
    public static void main(String[] args) {
        System.out.println("first run");
        UserInputReader userInputReader = new UserInputReader(System.in);
        DataValidator dataValidator = new DataValidator();
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader, dataValidator, userNumberStorage);

        userNumberDeliverer.getUserNumbers();
        Set<Integer> userNumbers = userNumberStorage.getUserNumbers();
        System.out.println("Podane liczby: " + userNumbers);

    }
}
