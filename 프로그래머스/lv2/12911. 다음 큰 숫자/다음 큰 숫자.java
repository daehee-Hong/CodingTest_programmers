class Solution {
    public int solution(int n) {
        int answer = 0;
        int nLen = 0;
        for (char c : Integer.toBinaryString(n).toCharArray())if (c == '1') nLen++;
        while (true){
            int len = 0;
            n++;
            for (char c : Integer.toBinaryString(n).toCharArray())if (c == '1') len++;
            if (nLen == len) break;
        }
        answer = n;
        return answer;
    }
}