import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n , m;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st  = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];

        int[][] dis = new int[n+1][10000];
        for(int i=0;i<n-1;i++){
            st  = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[s][t] = 1;
            arr[t][s] = 1;

            dis[s][t] = v;
            dis[t][s] = v;
        }

        for(int i=0;i<m;i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            solution(a,b,arr,dis);

        }



    }
    static void solution(int a, int b , int[][] arr , int[][] dis){
        Queue<Integer> que = new LinkedList<>();

        boolean[] visited = new boolean[n+1];
        visited[a] = true;
        que.add(a);

        int[] sum = new int[n+1];
        while(!que.isEmpty()){
            int k = que.poll();

            for(int i=1;i<=n;i++){
                if(arr[k][i] ==1 && !visited[i]){
                    sum[i] += dis[k][i] + sum[k];
                    if(i == b){
                        System.out.println(sum[i]);
                        return;
                    }

                    que.add(i);
                    visited[i] = true;
                }
            }
        }
    }

}
