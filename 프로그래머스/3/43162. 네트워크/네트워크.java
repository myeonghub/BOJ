import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        answer = bfs(n,computers);
        return answer ;
    }
    
    public int bfs (int n ,int[][] computers){
        Queue<Integer> que = new LinkedList<>();
        boolean[] visit = new boolean[n];
        int cnt = 0;
    
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                visit[i] = true;
                que.add(i);
                cnt++;
                while(!que.isEmpty()){
                    int tmp = que.poll();
                    for(int j = 0 ; j < n; j++){
                        if((computers[tmp][j] == 1 || computers[j][tmp]== 1) && !visit[j] ){
                                visit[j] = true;
                                que.add(j);
                            }   
                    }
                    
                }
            }
        }
        return cnt;
    }
   
}
        
        
