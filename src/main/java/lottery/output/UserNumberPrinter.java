package lottery.output;

import lottery.input.UserNumberStorage;

public class UserNumberPrinter {

    public void printUserNumbers(UserNumberStorage userNumberStorage){
        System.out.println("Your numbers: " + userNumberStorage.getUserNumbers());
    }
}
