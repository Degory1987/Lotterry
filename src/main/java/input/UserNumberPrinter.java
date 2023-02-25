package input;

import java.util.Set;

/**
 * This class display user numbers.
 */
public class UserNumberPrinter {
    //TODO not implements
    private final Set<Integer> numbersToPrint;

    public UserNumberPrinter(Set<Integer> numbersToPrint) {
        this.numbersToPrint = numbersToPrint;
    }

    public void printNumbers() {
        for (Integer number : numbersToPrint) {
            System.out.print(number + " ");
        }
    }
}
