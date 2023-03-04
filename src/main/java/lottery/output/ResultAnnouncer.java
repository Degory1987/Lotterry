package lottery.output;

import lottery.logic.ResultChecker;

/**
 * generated result info for player
 */
public class ResultAnnouncer {
    private final ResultChecker resultChecker;
    public ResultAnnouncer(ResultChecker resultChecker) {
        this.resultChecker = resultChecker;
    }

    public void lottoResultAnnouncer(){
        resultChecker.printHowManyNumbersHit();
        if(resultChecker.ifWin()){
            System.out.println("you win");
        }else {
            System.out.println("Maybe next time!");
        }
    }

}
