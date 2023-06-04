class Solution {
    public int[] solution(String[] keyinput, int[] board) {
         int[] answer = new int[2];

        for (int i = 0; i < keyinput.length; i++) {
            if("up".equals(keyinput[i])){
                answer[1] += 1;
                if (Math.abs(answer[1]) > (int) board[1] / 2){
                    answer[1] -= 1;
                }
            }else if ("down".equals(keyinput[i])){
                answer[1] -= 1;
                if (Math.abs(answer[1]) > (int) (board[1] / 2)){
                    answer[1] += 1;
                }
            }else if ("left".equals(keyinput[i])){
                answer[0] -= 1;
                if (Math.abs(answer[0]) > (int) (board[0] / 2)){
                    answer[0] += 1;
                }
            }else if ("right".equals(keyinput[i])){
                answer[0] += 1;
                if (Math.abs(answer[0]) > (int) (board[0] / 2)){
                    answer[0] -= 1;
                }
            }
        }

        return answer;
    }
}