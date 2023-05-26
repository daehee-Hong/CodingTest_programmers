class Solution {
    public int[] solution(int money) {
         int[] answer = new int[2];
        for (int i = 5500; i <= money; i += 5500) {
            answer[0] += 1;
        }

        answer[1] = money - (answer[0] * 5500);
        return answer;
    }
}