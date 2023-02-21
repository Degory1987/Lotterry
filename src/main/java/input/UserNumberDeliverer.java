package input;

import config.LottoConfiguration;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Class provide user numbers
 */
public class UserNumberDeliverer {
    private final Set<Integer> userGivenNumbers = new LinkedHashSet<>();
    public void getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        while (getAllNumber(userGivenNumbers)) {
            int userNumber = scanner.nextInt();
            if (!isInRange(userNumber)) {
                System.out.println("NOT in RANGE!"); //TODO change this for some messages provider class
            } else if (userGivenNumbers.contains(userNumber)) {
                System.out.println();//TODO change this for some messages provider class
            } else {
                userGivenNumbers.add(userNumber);
            }
        }
        scanner.close();
    }

    public static boolean isInRange(int number) {
        return number > 0 && number < 99;
    }

    public boolean getAllNumber(Set<Integer> numbers) {
        return numbers.size() < LottoConfiguration.HOW_MANY_NUMBERS;
    }

//    public void displayGivenNumber(Set<Integer> givenNumbers) {
//        for (Integer number : givenNumbers) {
//            System.out.print(number + " ");
//        }
//    }
}
