package input;

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
        while (!userNumberStorage.getAllNumbers()) {
            int userNumber = userInputReader.readNumber();
            if (DataValidator.isInRange(userNumber)) {
                userNumberStorage.addNumber(userNumber);
                System.out.println("added " + userNumber);
            } else {
                System.out.println("Wrong number. Type another.");
            }
        }
        userInputReader.close();
    }
}


