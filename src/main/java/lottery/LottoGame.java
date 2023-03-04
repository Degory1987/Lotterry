package lottery;

import lottery.input.UserInputReader;
import lottery.input.UserNumberDeliverer;
import lottery.input.UserNumberStorage;
import lottery.logic.RandomNumberGenerator;
import lottery.logic.ResultChecker;
import lottery.output.ResultAnnouncer;

import java.util.Set;

public class LottoGame {
    public static void starGame() {
        UserInputReader userInputReader = new UserInputReader(System.in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader,userNumberStorage);
        userNumberDeliverer.getUserNumbers();

        Set<Integer> randomIntegers = randomNumberGenerator.generateRandomNumbers();
        Set<Integer> userNumbers = userNumberStorage.getUserNumbers();
        ResultChecker resultChecker = new ResultChecker(userNumbers, randomIntegers);
        resultChecker.getLottoResult(userNumbers,randomIntegers);
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer(resultChecker);

        System.out.println(userNumberStorage.getUserNumbers());
        resultAnnouncer.lottoResultAnnouncer();

    }
}
