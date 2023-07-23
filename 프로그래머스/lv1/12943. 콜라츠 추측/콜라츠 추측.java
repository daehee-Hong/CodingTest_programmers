class Solution {
    public int solution(int num) {
        int answer = 0;
        long val = (long) num;
        while (val != 1){
            answer++;
            if (answer >= 500){
                answer = -1;
                break;
            }
            if (val % 2 == 0){
                val = val / 2;
            }else {
                val = (val * 3) + 1;
            }
        }
        
        return answer;
    }
}