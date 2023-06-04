import java.util.*;


class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        String id = id_pw[0];
        String pw = id_pw[1];

        // id 확인
        if(Arrays.stream(db)
                .map(v -> v[0])
                .anyMatch(v -> v.equals(id))){

            // id, pw 확인
            if (Arrays.stream(db)
                    .anyMatch(v -> v[0].equals(id) && v[1].equals(pw))){
                answer = "login";
            }else {
                answer = "wrong pw";
            }
        }else {
            answer = "fail";
        }

        return answer;
    }
}