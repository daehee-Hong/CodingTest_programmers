class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        if ((double)(x1 - x2) / (double)(y1 - y2) == (double)((x3 - x4) / (double)(y3 - y4))) answer = 1;
        if((double)(x1 - x3) / (double)(y1 - y3) == (double)((x2 - x4) / (double)(y2 - y4))) answer = 1;

        return answer;
    }
}