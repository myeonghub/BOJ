import java.util.*;
class Solution {

    public int solution(int[][] maps) {
        int answer = 0;
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {0,0});
        int [] ax = {1,-1,0,0};
        int[] ay = {0,0,1,-1};
        while(!que.isEmpty()){
            int[] tmp = que.poll();
            
            for(int i = 0; i < 4 ; i++){
                int dx = ax[i] + tmp[0];
                int dy = ay[i] + tmp[1];
                
                if(dx >= maps[0].length || dy >= maps.length || dy < 0 || dx < 0){
                    continue;
                }
                
                if(maps[dy][dx] != 1){
                    continue;
                }
                maps[dy][dx] = maps[tmp[1]][tmp[0]] + 1;
                que.add(new int[] {dx,dy});
            }
        }
        answer = maps[maps.length - 1][maps[0].length - 1];
        
        return (answer == 1 ? -1 : answer);
    }
}