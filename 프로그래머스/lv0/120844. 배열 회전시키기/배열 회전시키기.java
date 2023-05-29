
class Solution {
        public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int plus = 0;
        if ("right".equals(direction)){
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1){
                    answer[0] = numbers[i];
                }else {
                    answer[i + 1] = numbers[i];
                }
            }
        } else if ("left".equals(direction)) {
            for (int i = numbers.length; i > 0; i--) {
                if (i == 1){
                    answer[numbers.length - 1] = numbers[0];
                }else {
                    answer[i - 2] = numbers[i - 1];
                }
                plus++;
            }
        }

        return answer;
        }
}