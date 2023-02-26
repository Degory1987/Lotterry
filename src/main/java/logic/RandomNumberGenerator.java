package logic;

import config.LottoConfiguration;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Class generate random numbers for a draw
 */
public class RandomNumberGenerator {

    public Set<Integer> generateRandomNumbers() {
        Set<Integer> randomNumbersList = new LinkedHashSet<>();
        Random random = new Random();
        for (int i = 0; i < LottoConfiguration.HOW_MANY_NUMBERS; i++) {
            random.nextInt(LottoConfiguration.UPPER_BOUND + 1);
            randomNumbersList.add(i);
        }
        return randomNumbersList;
    }
}

