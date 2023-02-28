
import input.UserInputReader;
import input.UserNumberDeliverer;
import input.UserNumberStorage;
import logic.RandomNumberGenerator;
import logic.ResultChecker;
import output.ResultAnnouncer;

import java.util.Set;


public class Main {
    public static void main(String[] args) {
        System.out.println("first run");
        UserInputReader userInputReader = new UserInputReader(System.in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> randomIntegers = randomNumberGenerator.generateRandomNumbers();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader,userNumberStorage);

        userNumberDeliverer.getUserNumbers();
        Set<Integer> userNumbers = userNumberStorage.getUserNumbers();

        System.out.println(userNumberStorage.getUserNumbers());
        ResultChecker resultChecker = new ResultChecker(userNumbers, randomIntegers);
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer(resultChecker);
        resultAnnouncer.lottoResultAnnouncer();

    }
}
