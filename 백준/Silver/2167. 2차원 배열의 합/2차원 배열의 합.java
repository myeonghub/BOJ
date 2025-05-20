import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int[][] sum = new int[N+1][M+1];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= M; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + arr[i-1][j-1];
            }
        }

        int q = Integer.parseInt(br.readLine());

        for(int I = 0; I < q; I++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(sum[x][y] - sum[i-1][y] - sum[x][j-1] + sum[i-1][j-1]);

        }


    }

   
}
