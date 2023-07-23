class Solution {
    public int solution(int[] numbers) {
        int index = 0;
        for (int i = 1; i < 10; i++) {
            boolean check = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i){
                    check = true;
                    break;
                }
            }
            if (check == false){
                index += i;
            }
        }
        return index;
    }
}