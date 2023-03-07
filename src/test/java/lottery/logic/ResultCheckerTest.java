package lottery.logic;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ResultCheckerTest {

    @Test
    void getLottoResult_should_return_true() {
        //given
        Set<Integer> userNumberStorage = new LinkedHashSet<>();
        userNumberStorage.add(1);
        userNumberStorage.add(2);
        userNumberStorage.add(3);
        userNumberStorage.add(4);
        userNumberStorage.add(5);
        userNumberStorage.add(6);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.randomNumbersList.add(1);
        randomNumberGenerator.randomNumbersList.add(2);
        randomNumberGenerator.randomNumbersList.add(3);
        randomNumberGenerator.randomNumbersList.add(4);
        randomNumberGenerator.randomNumbersList.add(5);
        randomNumberGenerator.randomNumbersList.add(6);
        //when
        ResultChecker resultChecker = new ResultChecker(randomNumberGenerator, userNumberStorage);
        resultChecker.getLottoResult(userNumberStorage, randomNumberGenerator.getRandomNumbersList());
        //then
        assertEquals(userNumberStorage,randomNumberGenerator.randomNumbersList);
        assertTrue(resultChecker.ifWin());
    }
    @Test
    void getLottoResult_should_return_false() {
        //given
        Set<Integer> userNumberStorage = new LinkedHashSet<>();
        userNumberStorage.add(1);
        userNumberStorage.add(2);
        userNumberStorage.add(3);
        userNumberStorage.add(4);
        userNumberStorage.add(5);
        userNumberStorage.add(6);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.randomNumbersList.add(1);
        randomNumberGenerator.randomNumbersList.add(2);
        randomNumberGenerator.randomNumbersList.add(4);
        randomNumberGenerator.randomNumbersList.add(64);
        randomNumberGenerator.randomNumbersList.add(77);
        randomNumberGenerator.randomNumbersList.add(6);
        //when
        ResultChecker resultChecker = new ResultChecker(randomNumberGenerator, userNumberStorage);
        resultChecker.getLottoResult(userNumberStorage, randomNumberGenerator.getRandomNumbersList());
        //then
        assertNotEquals(userNumberStorage,randomNumberGenerator.randomNumbersList);
        assertFalse(resultChecker.ifWin());
    }
}