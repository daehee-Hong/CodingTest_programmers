class Solution {
    public boolean solution(int x) {
        String[] str = String.valueOf(x).split("");
        int sum = 0;
        for (String a : str){
            sum += Integer.parseInt(a);
        }
        
        return x % sum == 0 ? true : false;
    }
}