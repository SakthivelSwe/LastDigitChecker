public class LastDigitChecker {

    public static boolean hasSameLastDigit(int fNum,int sNum,int tNum) {
        if ((fNum > 9 && fNum < 1001) && (sNum > 9 && sNum < 1001) && (tNum > 9 && tNum < 1001)) {
            fNum %= 10;
            sNum %= 10;
            tNum %= 10;
            if((fNum == sNum) || (sNum == tNum) || (tNum == fNum)) {
                return true;
            }else {
                return false;
            }
        }
        return  false;
    }

   public static  boolean isValid(int Number) {
        if(Number > 9 && Number < 1001) {
            return  true;
        }else {
            return false;
        }
   }
}
