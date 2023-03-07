package lottery.input;

import lottery.config.AppMessagePrinter;
import lottery.config.LottoConfiguration;

/**
 * this class gets numbers from user and stored it.
 */
public class UserNumberDeliverer {

    private final UserInputReader userInputReader;
    private final UserNumberStorage userNumberStorage;

    public UserNumberDeliverer(UserInputReader userInputReader, UserNumberStorage userNumberStorage) {
        this.userInputReader = userInputReader;
        this.userNumberStorage = userNumberStorage;
    }

    public void getUserNumbers() {
        System.out.printf((AppMessagePrinter.GIVE_NUMBERS) + "%n", LottoConfiguration.HOW_MANY_NUMBERS);
        while (!userNumberStorage.getAllNumbers()) {
            String userInput = userInputReader.userInputReader();
            if (DataValidator.isNumber(userInput)) {
                int userNumber = Integer.parseInt(userInput);
                if (DataValidator.isInRange(userNumber)) {
                    userNumberStorage.addNumber(userNumber);
                } else {
                    System.out.println("Wrong number. Type another from "
                            + LottoConfiguration.LOWER_BOUND + " to "
                            + LottoConfiguration.UPPER_BOUND);
                }
            } else {
                System.out.println("Please enter a valid number.");
            }
        }
        userInputReader.close();
    }
}


