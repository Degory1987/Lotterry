package lottery.output;

import lottery.logic.RandomNumberGenerator;

public class RandomNumberPrinter {
    public void printUserNumbers(RandomNumberGenerator randomNumberGenerator){
        System.out.println("Lucky numbers: " + randomNumberGenerator.getRandomNumbersList());
    }
}
