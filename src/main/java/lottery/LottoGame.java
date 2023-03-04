package lottery;

import lottery.input.UserInputReader;
import lottery.input.UserNumberDeliverer;
import lottery.input.UserNumberStorage;
import lottery.logic.RandomNumberGenerator;
import lottery.logic.ResultChecker;
import lottery.output.RandomNumberPrinter;
import lottery.output.ResultAnnouncer;
import lottery.output.UserNumberPrinter;

import java.util.Set;


public class LottoGame {
    public static void starGame() {
        UserInputReader userInputReader = new UserInputReader(System.in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader,userNumberStorage);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        userNumberDeliverer.getUserNumbers();
        userNumberStorage.getUserNumbers();
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandomNumbers();
        ResultChecker resultChecker = new ResultChecker(userNumberStorage.getUserNumbers(), randomNumbers);
        resultChecker.getLottoResult(userNumberStorage.getUserNumbers(),randomNumberGenerator.getRandomNumbersList());

        ResultAnnouncer resultAnnouncer = new ResultAnnouncer(resultChecker);
        UserNumberPrinter userNumberPrinter = new UserNumberPrinter();
        userNumberPrinter.printUserNumbers(userNumberStorage);
        RandomNumberPrinter randomNumberPrinter = new RandomNumberPrinter();
        randomNumberPrinter.printUserNumbers(randomNumberGenerator);
        resultAnnouncer.lottoResultAnnouncer();
    }
}
