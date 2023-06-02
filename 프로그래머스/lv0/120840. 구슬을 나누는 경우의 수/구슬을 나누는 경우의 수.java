import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        int a = balls - share;
        BigInteger af = new BigInteger("1");
        BigInteger ballsF = new BigInteger("1");
        BigInteger shareF = new BigInteger("1");

        for (int i = balls; i > 1; i--) {
            ballsF = ballsF.multiply(BigInteger.valueOf(i));
        }
        for (int i = share; i > 1; i--) {
            shareF = shareF.multiply(BigInteger.valueOf(i));
        }
        for (int i = a; i > 1; i--) {
            af = af.multiply(BigInteger.valueOf(i));
        }
        //answer = balls! / (share! * (balls - share)!)
        answer = ballsF.divide(shareF.multiply(af)).intValue();
        return answer;
    }
}