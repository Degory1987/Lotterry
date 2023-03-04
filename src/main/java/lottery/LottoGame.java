package lottery;

import lottery.config.AppMessagePrinter;
import lottery.input.UserInputReader;
import lottery.input.UserNumberDeliverer;
import lottery.input.UserNumberStorage;
import lottery.logic.RandomNumberGenerator;
import lottery.logic.ResultChecker;
import lottery.output.RandomNumberPrinter;
import lottery.output.ResultAnnouncer;
import lottery.output.UserNumberPrinter;


public class LottoGame {
    public static void startGame() {
        System.out.println(AppMessagePrinter.WELCOME_MESSAGE);
        System.out.println(AppMessagePrinter.LOTTERY_MENU);
        UserNumberStorage userNumberStorage = getUserNumbersFromUserInput();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.generateRandomNumbers();
        printUserAndRandomNumbers(userNumberStorage, randomNumberGenerator);
        announceResult(randomNumberGenerator, userNumberStorage);
    }

    private static UserNumberStorage getUserNumbersFromUserInput() {
        UserInputReader userInputReader = new UserInputReader(System.in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader, userNumberStorage);
        userNumberDeliverer.getUserNumbers();
        return userNumberStorage;
    }


    private static void printUserAndRandomNumbers(UserNumberStorage userNumberStorage, RandomNumberGenerator randomNumberGenerator) {
        UserNumberPrinter userNumberPrinter = new UserNumberPrinter();
        RandomNumberPrinter randomNumberPrinter = new RandomNumberPrinter();
        userNumberPrinter.printUserNumbers(userNumberStorage);
        randomNumberPrinter.printUserNumbers(randomNumberGenerator);
    }

    private static void announceResult(RandomNumberGenerator randomNumberGenerator, UserNumberStorage userNumberStorage) {
        ResultChecker resultChecker = new ResultChecker(randomNumberGenerator, userNumberStorage.getUserNumbers());
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer(resultChecker);
        resultChecker.getLottoResult(userNumberStorage.getUserNumbers(), randomNumberGenerator.getRandomNumbersList());
        resultAnnouncer.lottoResultAnnouncer();
    }

}
