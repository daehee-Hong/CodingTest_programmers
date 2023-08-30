import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer1 = 0;
        int answer2 = 0;
        int j = A.length-1;

        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer1 += A[i] * B[i];
            answer2 += A[i] * B[j];
            j--;
        }

        return Math.min(answer1, answer2);
    }
}