package input;

import config.LottoConfiguration;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * this class holds user numbers
 */
public class UserNumberStorage {
    private final Set<Integer> userNumbers = new
            HashSet<>();

    void addNumber(int number) {
        userNumbers.add(number);
    }

    boolean isFull() {
        return userNumbers.size() == LottoConfiguration.HOW_MANY_NUMBERS;
    }

    public Set<Integer> getUserNumbers() {
        return Collections.unmodifiableSet(userNumbers);
    }
}
