import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] array = Arrays.stream(numbers).sorted().toArray();
        return array[array.length -1] * array[array.length -2];
    }
}