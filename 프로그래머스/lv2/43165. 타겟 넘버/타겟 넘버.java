import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public static int solution(int[] numbers, int target) {
        int cnt = BFS(numbers, target);
        return cnt;
    }
    
    public static int BFS (int[] numbers, int target){
        Queue<Pair> Q = new LinkedList<>();
        Q.offer(new Pair(0, numbers[0]));
        Q.offer(new Pair(0, numbers[0] * -1));
        int L = 0;
        
        while(!Q.isEmpty()){
            Pair cur = Q.poll();
            
            if (cur.position == numbers.length - 1
                && cur.sum == target) L++;
            else {
                int next = cur.position + 1;
                if (next > numbers.length - 1) continue;
                
                Q.offer(new Pair(next, cur.sum + numbers[next]));
                Q.offer(new Pair(next, cur.sum + numbers[next] * -1));
            }
        }
        return L;
    }
    
    static class Pair {
        int position;
        int sum;
        
        Pair (int position, int sum){
            this.position = position;
            this.sum = sum;
        }
    }
}