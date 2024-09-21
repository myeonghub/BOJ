import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr;
    static boolean [] visit;
    static int n,k,count;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n+1][n+1];
        boolean bool = false ;
        visit = new boolean[n+1];
        for(int i=0;i<k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] =1;
            if(a==1 || b==1){
                bool = true;
            }
        }

        if(bool){
            visit[1] = true;
            bfs(1);
            System.out.println(count);
        }
        else {
            System.out.println(0);
        }




    }

    public static void bfs(int start) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{start, 0});  // 큐에 (노드, 깊이) 저장
        visit[start] = true;

        while (!que.isEmpty()) {
            int[] current = que.poll();
            int person = current[0];
            int depth = current[1];

            // 깊이 2까지만 탐색 (친구와 친구의 친구)
            if (depth >= 2) {
                continue;
            }

            // 친구 탐색
            for (int i = 1; i <= n; i++) {
                if (arr[person][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    count++;  // 초대할 친구 수 증가
                    que.add(new int[]{i, depth + 1});  // 다음 친구 탐색, 깊이 증가
                }
            }
        }
    }
}
