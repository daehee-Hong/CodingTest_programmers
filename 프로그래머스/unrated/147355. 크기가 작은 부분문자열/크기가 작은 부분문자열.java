class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();

        for (int i = 0; i <= t.length() - length; i++) {
            long cur = Long.parseLong(t.substring(i, i + length));
            long val = Long.parseLong(p);

            if (cur <= val) answer++;
        }

        return answer;
    }
}