class Solution {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        char[] x = s.toCharArray();
        for (int i = 0; i < x.length; i++) {
            String a = String.valueOf(x[i]).toUpperCase();
            System.out.println(a);
            if ("P".equals(a)) pCnt++;
            if ("Y".equals(a)) yCnt++;
        }

        return pCnt == yCnt ? true : false;
    }
}