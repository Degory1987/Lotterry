package logic;

import java.util.Set;

/**
 * Class checks if the player won
 */
public class ResultChecker {
    private final Set<Integer> finalHitNumbers;
    private final Set<Integer> randomNumbers;

    public ResultChecker(Set<Integer> finalHitNumbers, Set<Integer> randomNumbers) {
        this.finalHitNumbers = finalHitNumbers;
        this.randomNumbers = randomNumbers;
    }

    public void getLottoResult(Set<Integer> userNumberStorage, Set<Integer> randomNumbers) {
        for (Integer userNumber : userNumberStorage) {
            for (Integer randomNumber : randomNumbers) {
                if (userNumber.equals(randomNumber)) {
                    finalHitNumbers.add(userNumber);
                }
            }
        }
    }
    public boolean ifWin(){
        return finalHitNumbers.equals(randomNumbers);
    }
}
