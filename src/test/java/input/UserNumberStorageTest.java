package input;

import config.LottoConfiguration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserNumberStorageTest {

    @Test
    void addNumber_should_add_one_number(){
        //given
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        int number = 1;
        //when
        userNumberStorage.addNumber(number);
        //then
        assertEquals(number,userNumberStorage.getUserNumbers().size());
    }
    @Test
    void isFull_should_return_true_when_userStorage_size_equals_HOW_MANY_NUMBERS() {
        //given
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        int maxSize = LottoConfiguration.HOW_MANY_NUMBERS;
        //when
        for (int i = 0; i < maxSize; i++) {
            userNumberStorage.addNumber(i);
        }
        //then
        assertTrue(userNumberStorage.getAllNumbers());
    }

    @Test
    void isFull_should_return_false_when_userStorage_size_is_less_than_HOW_MANY_NUMBERS(){
        //given
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        int howManyNumbers = LottoConfiguration.HOW_MANY_NUMBERS;
        //when
        for (int i = 0; i <howManyNumbers - 1 ; i++) {
            userNumberStorage.addNumber(howManyNumbers);
        }
        //then
        assertFalse(userNumberStorage.getAllNumbers());
    }
    @Test
    void isFull_should_return_false_when_userStorage_size_is_bigger_than_HOW_MANY_NUMBERS(){
        //given
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        int howManyNumbers = LottoConfiguration.HOW_MANY_NUMBERS;
        //when
        for (int i = 0; i < howManyNumbers + 1 ; i++) {
            userNumberStorage.addNumber(howManyNumbers);
        }
        //then
        assertFalse(userNumberStorage.getAllNumbers());
    }
}