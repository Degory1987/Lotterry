package lottery.logic;

import lottery.config.LottoConfiguration;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class generate random numbers for a draw
 */
public class RandomNumberGenerator {

    private final Random random = new Random();
    Set<Integer> randomNumbersList = new HashSet<>();

    public Set<Integer> generateRandomNumbers() {
        while (randomNumbersList.size() < LottoConfiguration.HOW_MANY_NUMBERS) {
            randomNumbersList.add(getRandomNumber());
        }
        return randomNumbersList;
    }

    private int getRandomNumber() {
        return random.nextInt(LottoConfiguration.UPPER_BOUND + 1);
    }

    public Set<Integer> getRandomNumbersList() {
        return this.randomNumbersList;
    }
}

