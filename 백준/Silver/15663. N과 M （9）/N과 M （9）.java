import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuffer sb = new StringBuffer();
    static Set<String> set = new HashSet<>();
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
            String str = "";
            for (int i = 0; i < M; i++) {
                str += arr2[i]+" ";
            }
            if(!set.contains(str+" ")) {
                set.add(str+" ");
                sb.append(str);
                sb.append("\n");
            }
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i])
                continue;

//            for(int j=i-1;j>=0;j--) {
//                visited[j] = true;
//            }
            visited[i] = true;
            arr2[k] = arr[i];
            dfs(k + 1, arr, arr2, visited);
//            for(int j=i-1;j>=0;j--) {
//                visited[j] = false;
//            }
            visited[i] = false;


        }

    }
}
