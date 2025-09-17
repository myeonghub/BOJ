import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];

        for(int i = 0; i < sizes.length; i++){
            w[i] = sizes[i][0];
            h[i] = sizes[i][1];
            if(w[i] < h[i]){
                int tmp = 0;
                tmp = w[i];
                w[i] = h[i];
                h[i] = tmp;
            }
        }
        Arrays.sort(w);
        Arrays.sort(h);
        
        answer = w[w.length - 1] * h[w.length - 1];


        return answer;
    }
}