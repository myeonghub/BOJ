import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][2];


        for (int i = 1; i <= n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st1.nextToken());
            arr[i][1] = Integer.parseInt(st1.nextToken());
        }

        int[][] dp = new int[n + 1][k + 1];


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j - arr[i][0] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i][0]] + arr[i][1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }


        System.out.println(dp[n][k]);

    }
}
