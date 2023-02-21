package logic;

import config.LottoConfiguration;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {
    
    @Test
    void should_return_random_numbers_in_range(){
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        //when
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandomNumbers();
        //then
        for (int number : randomNumbers){
            assertTrue(number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND,"Numbers are in range");
        }
    }

    @Test
    void should_generate_6_random_numbers_passed(){
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int expectedSize = LottoConfiguration.HOW_MANY_NUMBERS;
        //when
        Set<Integer> randomNumbers = randomNumberGenerator.generateRandomNumbers();
        int actualSize = randomNumbers.size();
        //then
        assertEquals(expectedSize, actualSize);
    }
}