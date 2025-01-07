import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];
        boolean [] visited = new boolean[N+1];

        dfs(0,arr,visited);


    }
    public static void dfs(int k , int[] arr , boolean[] visited){
        if(k ==M){
           for (int i = 0; i < M; i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.println();
           return;
       }
        for (int i = 1; i <= N; i++) {
            if (visited[i])
                continue;
            for(int j=i;j>=0;j--) {
                visited[j] = true;
            }
            arr[k] = i;
            dfs(k + 1,arr,visited);
            for(int j=i;j>=0;j--) {
                visited[j] = false;
            }

        }

    }
}
