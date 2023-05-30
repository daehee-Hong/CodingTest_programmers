class Solution {
    public int solution(int num, int k) {
        int index = 0;
        int check = 0;
        for (String s : String.valueOf(num).split("")) {
            index++;
            if (s.equals(String.valueOf(k))){
                check++;
                break;
            }
        }

        return check > 0 ? index : -1;
    }
}