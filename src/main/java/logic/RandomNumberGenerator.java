package logic;

import config.LottoConfiguration;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class generate random numbers for a draw
 */
public class RandomNumberGenerator {

    private final Random random = new Random();

    public Set<Integer> generateRandomNumbers() {
        Set<Integer> randomNumbersList = new HashSet<>();
        while (randomNumbersList.size() < LottoConfiguration.HOW_MANY_NUMBERS) {
            randomNumbersList.add(getRandomNumber());
        }
        return randomNumbersList;
    }

    private int getRandomNumber() {
        return random.nextInt(LottoConfiguration.UPPER_BOUND + 1);
    }
}

