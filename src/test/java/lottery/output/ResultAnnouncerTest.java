package lottery.output;

import lottery.logic.RandomNumberGenerator;
import lottery.logic.ResultChecker;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedHashSet;


class ResultAnnouncerTest {

    @Test
    @Disabled("Not implemented")
    void lottoResultAnnouncer() {
        //given
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.getRandomNumbersList().add(1);
        randomNumberGenerator.getRandomNumbersList().add(2);
        randomNumberGenerator.getRandomNumbersList().add(3);
        randomNumberGenerator.getRandomNumbersList().add(4);
        randomNumberGenerator.getRandomNumbersList().add(5);
        randomNumberGenerator.getRandomNumbersList().add(6);
        LinkedHashSet<Integer> finalRandomNumbers = new LinkedHashSet<>();
        finalRandomNumbers.add(1);
        finalRandomNumbers.add(2);
        finalRandomNumbers.add(3);
        finalRandomNumbers.add(4);
        finalRandomNumbers.add(5);
        finalRandomNumbers.add(6);
        ResultChecker resultChecker = new ResultChecker(randomNumberGenerator,finalRandomNumbers );
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer(resultChecker);
        //then
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        resultAnnouncer.lottoResultAnnouncer();

       // assertEquals("you win",outContent.toString());
        //todo repair this
    }
}