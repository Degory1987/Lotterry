
import input.UserInputReader;
import input.UserNumberDeliverer;
import input.UserNumberStorage;


public class Main {
    public static void main(String[] args) {
        System.out.println("first run");
        UserInputReader userInputReader = new UserInputReader(System.in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader,userNumberStorage);

        userNumberDeliverer.getUserNumbers();

        System.out.println(userNumberStorage.getUserNumbers());


    }
}
