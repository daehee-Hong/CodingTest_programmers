class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        int a = 0;
        int index = 0;
        while (k != a){
            if (index > numbers.length -1){
               index = 0;
            }
            System.out.println(numbers[index]);
            a++;
            if (a == k) answer = numbers[index];
            if (index == numbers.length -1){
                index = 1;
            }else {
                index += 2;
            }
            
        }
        
        return answer;
    }
}