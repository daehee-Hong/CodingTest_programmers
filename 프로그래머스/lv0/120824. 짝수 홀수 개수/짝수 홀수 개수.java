class Solution {
    public int[] solution(int[] num_list) {
     int count1 = 0, count2 = 0;
        for (int i : num_list) {
            if (i % 2 == 0){
                count1 += 1;
            }else {
                count2 += 1;
            }
        }
        return new int[]{count1, count2};
    }
}