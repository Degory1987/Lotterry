package input;

import config.LottoConfiguration;

/**
 * this class is responsible for validation numbers used in draw
 */
public class DataValidator {
    public static boolean isInRange(int number){
        return number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND;
    }
}
