class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int[] start = new int[2];
        int[] end = new int[2];

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        int maxX = Integer.MIN_VALUE;
        int maxy = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")){
                if (i < minX) {
                    minX = i;
                    start[0] = i;
                }
                if (wallpaper[i].indexOf("#") < minY) {
                    minY = wallpaper[i].indexOf("#");
                    start[1] = wallpaper[i].indexOf("#"); // start y 좌표
                }

                if (i > maxX){
                    maxX = i;
                    end[0] = i;
                }
                if (wallpaper[i].lastIndexOf("#") > maxy){
                    maxy = wallpaper[i].lastIndexOf("#");
                    end[1] = wallpaper[i].lastIndexOf("#");
                }
            }
        }
        answer[0] = start[0];
        answer[1] = start[1];
        answer[2] = end[0] + 1;
        answer[3] = end[1] + 1;

        return answer;
    }
}