package input;

import config.LottoConfiguration;

public class DataValidator {

    public static boolean isInRange(int number){
        return number >= LottoConfiguration.LOWER_BOUND && number <= LottoConfiguration.UPPER_BOUND;
    }

}
