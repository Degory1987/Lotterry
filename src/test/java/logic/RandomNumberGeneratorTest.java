package logic;

import config.LottoConfiguration;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {
    
    @Test
    void should_return_random_numbers_in_range(){
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        //when
        LinkedList<Integer> randomNumbers = randomNumberGenerator.generateRandomNumbers();
        //then
        for (int number : randomNumbers){
            assertTrue(number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND,"Numbers are in range");
        }
    }
}