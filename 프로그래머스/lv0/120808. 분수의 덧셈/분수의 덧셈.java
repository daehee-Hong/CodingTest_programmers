import java.util.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int boonmo = denom1 * denom2;
        int boonja = numer1 * denom2 + numer2 * denom1;
        
        int min = Math.min(boonja, boonmo);
        int gcd = 1;
        for (int i = 2; i <= min; i++) {
            if (boonja % i == 0 && boonmo % i == 0){
                gcd = i;
            }
        }

        answer[0] = boonja / gcd;
        answer[1] = boonmo / gcd;
        return answer;
    }
}