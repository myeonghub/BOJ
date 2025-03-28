import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        int[] arr2 = new int[N + 1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =1;i<N+1;i++){
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);
        boolean[] visited = new boolean[N + 1];


        dfs(0, arr,arr2, visited);
        System.out.println(sb);

    }

    public static void dfs(int k, int[] arr, int[] arr2, boolean[] visited) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr2[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (visited[i])
                continue;

            visited[i] = true;
            arr2[k] = arr[i];
            dfs(k + 1, arr, arr2, visited);
            visited[i] = false;

        }

    }
}
