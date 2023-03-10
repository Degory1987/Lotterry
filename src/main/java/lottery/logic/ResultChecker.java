package lottery.logic;

import lottery.config.AppMessagePrinter;

import java.util.HashSet;
import java.util.Set;

/**
 * Class checks if the player won
 */
public class ResultChecker {

    private final RandomNumberGenerator randomNumberGenerator;
    private Set<Integer> finalHitNumbers;

    public ResultChecker(RandomNumberGenerator randomNumberGenerator, Set<Integer> finalHitNumbers) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.finalHitNumbers = finalHitNumbers;
    }

    public void getLottoResult(Set<Integer> userNumberStorage, Set<Integer> randomNumbers) {
        this.finalHitNumbers = new HashSet<>();
        for (Integer userNumber : userNumberStorage) {
            for (Integer randomNumber : randomNumbers) {
                if (userNumber.equals(randomNumber)) {
                    finalHitNumbers.add(userNumber);
                }
            }
        }
    }
    public void printHowManyNumbersHit(){
        System.out.printf((AppMessagePrinter.HIT_NUMBERS) + "%n", finalHitNumbers.size());
    }
    public boolean ifWin(){
        return finalHitNumbers.equals(randomNumberGenerator.getRandomNumbersList());
    }
}
