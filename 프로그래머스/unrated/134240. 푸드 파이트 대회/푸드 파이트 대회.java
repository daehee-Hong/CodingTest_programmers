class Solution {
public String solution(int[] food) {
        String answer = "";

        for (int i = food.length-1; i > 0; i--) {
            int cur = food[i] % 2 != 0 ? (food[i] - 1) / 2: food[i] / 2;
            String repeat = String.valueOf(i).repeat(cur);
            if (i == food.length-1){
                answer += repeat + "0" + repeat;
            }else {
                answer = repeat + answer + repeat;
            }
        }

        return answer;
    }
}