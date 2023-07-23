class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++){
            int cur = arr[i];
            answer += cur;
        }
        return answer / arr.length;
    }
}