class Solution {
    public static int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int[] answer = new int[str.length];
        int index = 0;
        int index2 = str.length - 1;

        while (true){
            if(index2 == -1) break;
            answer[index++] = Integer.parseInt(str[index2--]);
        }

        return answer;
    }
}