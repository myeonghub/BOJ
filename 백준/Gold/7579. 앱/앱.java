import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] memory = new int[n];
        int[] cost = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            memory[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n][10001];

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 10000; j++) {
                if (i == 0) {
                    if (j >= cost[i]) dp[i][j] = memory[i];
                } else {
                    if (j >= cost[i]) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - cost[i]] + memory[i]);
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
                if (dp[i][j] >= m) {
                    result = Math.min(result, j);
                }
            }
        }

        System.out.println(result);
    }
}
