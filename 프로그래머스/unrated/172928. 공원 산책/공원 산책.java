class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 시작위치 찾기
        int[] start = new int[2];
        for (int j = 0; j < park.length; j++) {
            if (park[j].contains("S")){
                start[1] = park[j].indexOf("S");
                start[0] = j;
                break;
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String a = route[0];                // 방향
            int b = Integer.parseInt(route[1]); // 이동거리

            int x = start[1];
            int y = start[0];

            for (int j = 0; j < b; j++) {

                if ("E".equals(a)) {
                    x += 1;
                }
                else if ("S".equals(a)) {
                    y += 1;
                }
                else if ("W".equals(a)) {
                    x -= 1;
                }
                else if ("N".equals(a)) {
                    y -= 1;
                };

                if (x < 0 || y < 0) break;
                else if (x >= park[0].length() || y >= park.length) break;
                else if (park[y].split("")[x].equals("X")) break;
                else if (j == b - 1){
                    start[1] = x;
                    start[0] = y;
                }
                System.out.println(y +" " + x);
            }

        }
        return start;
    }
}