
import input.UserInputReader;


public class Main {
    public static void main(String[] args) {
        System.out.println("first run");
        UserInputReader userInputReader = new UserInputReader(System.in);
        try {
            int i = userInputReader.readNumber();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        UserNumberStorage userNumberStorage = new UserNumberStorage();
//        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader,userNumberStorage);

//        userNumberDeliverer.getUserNumbers();
//        Set<Integer> userNumbers = userNumberStorage.getUserNumbers();
//        System.out.println("Podane liczby: " + userNumbers);

    }
}
