package lottery.input;

import lottery.config.LottoConfiguration;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * this class holds user numbers
 */
public class UserNumberStorage {
    private final Set<Integer> userNumbers = new LinkedHashSet<>();

    void addNumber(int number) {
        userNumbers.add(number);
    }

    boolean getAllNumbers() {
        return userNumbers.size() == LottoConfiguration.HOW_MANY_NUMBERS;
    }

    public Set<Integer> getUserNumbers() {
        return Collections.unmodifiableSet(userNumbers);
    }
}
