package input;

import config.LottoConfiguration;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserNumberStorage {
    private final Set<Integer> userNumbers = new LinkedHashSet<>();

    public void addNumber(int number){
        userNumbers.add(number);
    }
    public boolean isFull(){
        return userNumbers.size() == LottoConfiguration.HOW_MANY_NUMBERS;
    }
    public Set<Integer> getUserNumbers(){
        return Collections.unmodifiableSet(userNumbers);
    }
}
