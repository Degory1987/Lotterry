package lottery.input;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserNumberDelivererTest {

    @Test
    void getUserNumbers_should_add_six_numbers() {
        //given
        String input = "1 2 3 4 5 6";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        UserInputReader userInputReader = new UserInputReader(in);
        UserNumberStorage userNumberStorage = new UserNumberStorage();
        UserNumberDeliverer userNumberDeliverer = new UserNumberDeliverer(userInputReader, userNumberStorage);
        //when
        userNumberDeliverer.getUserNumbers();
        //then
        assertEquals(6, userNumberStorage.getUserNumbers().size());
    }
}