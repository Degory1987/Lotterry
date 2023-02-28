package output;

import logic.ResultChecker;

/**
 * generated result info for player
 */
public class ResultAnnouncer {
    private final ResultChecker resultChecker;
    public ResultAnnouncer(ResultChecker resultChecker) {
        this.resultChecker = resultChecker;
    }

    public void lottoResultAnnouncer(){
        if(resultChecker.ifWin()){
            System.out.println("you win");
        }else {
            System.out.println("Maybe next time!");
        }
    }

}
