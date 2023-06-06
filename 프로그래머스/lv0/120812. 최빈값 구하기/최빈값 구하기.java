import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(array);
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.containsKey(array[i]) ? map.get(array[i]) + 1 : ++cnt);
            cnt=0;
        }

        System.out.println("map = " + map);

        Integer max = map.values().stream().max(Comparator.naturalOrder()).orElse(0);

        long count = map.values().stream()
                .filter(v -> v.equals(max))
                .count();

        if (count > 1){
            answer = -1;
        }else {
            int key = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(max)){
                    key = entry.getKey();
                }
            }
            answer = key;
        }
        return answer;
    }
}