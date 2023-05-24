class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        if (n > 0 && n < 1000){
            if (n/10 <= k && k < 1000){
                answer += n * 12000;
                answer += (k - n/10) * 2000;                
            }else {
                answer += n * 12000;
                answer += k * 2000;    
            }
        }
        return answer;
    }
}