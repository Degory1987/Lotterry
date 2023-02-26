package input;

/**
 * Class take numbers from user and stored it.
 */
public class UserNumberDeliverer {

    private final UserInputReader userInputReader;
    private final UserNumberStorage userNumberStorage;

    public UserNumberDeliverer(UserInputReader userInputReader, UserNumberStorage userNumberStorage) {
        this.userInputReader = userInputReader;
        this.userNumberStorage = userNumberStorage;
    }

    public void getUserNumbers() {
        while (!userNumberStorage.isFull()) {
            int userNumber = userInputReader.readNumber();
            if (DataValidator.isInRange(userNumber)) {
                userNumberStorage.addNumber(userNumber);
                System.out.println("dodano " + userNumber);
            } else {
                System.out.println("Niepoprawna liczba. Podaj inną");
            }
        }
        userInputReader.close();
    }
}


