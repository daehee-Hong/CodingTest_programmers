
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String cur = goal[i];

            if (index1 < cards1.length && cur.equals(cards1[index1])){
                index1++;
                continue;
            }
            if (index2 < cards2.length && cur.equals(cards2[index2])){
                index2++;
                continue;
            }
            answer = "No";
            return answer;
        }

        return answer;
    }
}