package logic;

import config.LottoConfiguration;

import java.util.LinkedList;
import java.util.Random;

/**
 * Class generate random numbers for a game
 */
public class RandomNumberGenerator {
    public LinkedList<Integer> generateRandomNumbers() {
        LinkedList<Integer> randomNumbersList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < LottoConfiguration.RANDOM_NUMBER; i++) {
            random.nextInt(LottoConfiguration.UPPER_BOUND + 1);
            randomNumbersList.add(i);
        }
        return randomNumbersList;
    }
}

