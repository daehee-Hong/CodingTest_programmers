import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];


        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);

            for (int j = 0; j < n - str1.length(); j++) sb.append("0");

            strArr1[i] = sb.append(str1).toString().replaceAll("0", " ").replaceAll("1", "#");
            sb.delete(0, sb.length());

            for (int k = 0; k < n - str2.length(); k++) sb.append("0");

            strArr2[i] = sb.append(str2).toString().replaceAll("0", " ").replaceAll("1", "#");
        }
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str1 = strArr1[i];
            String str2 = strArr2[i];
            for (int j = 0; j < n; j++) {
                String a = String.valueOf(str1.charAt(j));
                String b = String.valueOf(str2.charAt(j));
                if (" ".equals(a) && " ".equals(b)){
                    sb.append(" ");
                }else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}