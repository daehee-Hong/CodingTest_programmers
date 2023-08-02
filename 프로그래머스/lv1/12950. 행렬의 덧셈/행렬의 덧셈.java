class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int length = arr1[0].length;
        int length2 = arr1.length;
        int[][] answer = new int[length2][length];
        
        for(int i = 0; i < length2; i++){
            for (int j = 0; j < length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}