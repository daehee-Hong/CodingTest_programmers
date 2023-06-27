class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] arr = new int[200];
        
        for (int[] line : lines){
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int i = start; i < end; i++){
                arr[i] += 1;
            }
            // 0 = 1, 2, 3, 4 = 1++
            // 3,4,5,6,7,8 = 1++
            // 3 > 1, 4 > 1, answer = 2
        }
        
        for (int x : arr){
            if(x > 1) answer++;
        }
        
        return answer;
    }
}