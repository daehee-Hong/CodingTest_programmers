import java.util.Arrays;
class Solution {
    static int[] arr;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = i;
        
        for (int i = 0; i < computers.length; i++){
            for (int j = 0; j < computers[i].length; j++){
                if (computers[i][j] == 1){ // 1일때만 연결
                    int fa = Find(i + 1);   // index + 1이 컴퓨터번호
                    int fb = Find(j + 1);
                    
                    if (fa != fb){
                        Union(fa, fb);
                    }
                }
            }
        }
        
        for (int i = 1; i <= n; i++) if(arr[i] == i) answer++;
        
        return answer;
    }
    
    public static int Find(int x){
        if (arr[x] == x) return x;
        return arr[x] = Find(arr[x]);
    }
    
    public static void Union(int a, int b){
        int fa = Find(a);
        int fb = Find(b);
        
        if (fa > fb){
            arr[fb] = fa;
        }else {
            arr[fa] = fb;
        }
    }
}