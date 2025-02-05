import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][3];
        for (int i = 1; i < n+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] max_dp = new int[n+1][3];
        int[][] min_dp = new int[n+1][3];

        for(int i=1;i<n+1;i++){
            max_dp[i][0] = Math.max(max_dp[i-1][0] , max_dp[i-1][1]) + arr[i][0];
            max_dp[i][1] = Math.max(max_dp[i-1][0] , Math.max(max_dp[i-1][1], max_dp[i-1][2])) + arr[i][1];
            max_dp[i][2] = Math.max(max_dp[i-1][2] , max_dp[i-1][1]) + arr[i][2];

            min_dp[i][0] = Math.min(min_dp[i-1][0] , min_dp[i-1][1]) + arr[i][0];
            min_dp[i][1] = Math.min(min_dp[i-1][0] , Math.min(min_dp[i-1][1], min_dp[i-1][2])) + arr[i][1];
            min_dp[i][2] = Math.min(min_dp[i-1][2] , min_dp[i-1][1]) + arr[i][2];
        }

        int max = 0;
        int min = 10000000;

        for(int i = 0; i < 3; i++) {
            min = Math.min(min, min_dp[n][i]);
            max = Math.max(max, max_dp[n][i]);
        }

        System.out.println(max +" " + min);



    }
}
