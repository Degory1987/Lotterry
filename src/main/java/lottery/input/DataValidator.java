package lottery.input;

import lottery.config.LottoConfiguration;

/**
 * this class is responsible for validation numbers used in draw
 */
public class DataValidator {
    public static boolean isInRange(int number){
        return number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND;
    }

    public static boolean isNumber(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
