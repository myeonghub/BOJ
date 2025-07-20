import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int cnt;
    static int[] X = {0,0,-1,1};
    static int[] Y = {1,-1,0,0};
    static boolean chk = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];

        boolean[][] visit = new boolean[M][N];

        for(int i = 0; i < M; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            dfs(0,i,arr,visit);
            if(chk){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");


    }
    static void dfs (int y , int x, int[][] arr , boolean[][] visit) {
        if(y == M - 1){
            chk = true;
            return ;
        }

        for(int i = 0 ; i < 4; i++){
            int a = x + X[i];
            int b = y + Y[i];

            if(a < 0 || b < 0 || a >= N || b >= M){
                continue;
            }
            if(arr[b][a] == 0 && !visit[b][a]){
                visit[b][a] = true;
                dfs(b,a,arr,visit);
            }
        }


    }

}
