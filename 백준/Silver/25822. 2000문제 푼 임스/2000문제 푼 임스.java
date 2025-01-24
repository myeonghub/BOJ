import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double c = Double.parseDouble(br.readLine());
        int stric = 0;

        if (c >= 1.98) {
            stric = 2;
        } else if (c >= 0.99) {
            stric = 1;
        }

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n + 1][stric + 1];

        int max = 0;
        int maxstric = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= stric; j++) {
                if (arr[i] > 0) {
                    // 문제를 푼 경우
                    dp[i][j] = dp[i - 1][j] + 1;
                } else if (j > 0) {
                    // 문제를 풀지 못한 경우, 스트릭 프리즈를 사용하여 유지
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 문제를 풀지 못했고 프리즈도 없는 경우
                    dp[i][j] = 0;
                }
                maxstric = Math.max(maxstric, dp[i][j]);
                max = Math.max(max,arr[i]);
            }
        }

        System.out.println(maxstric);
        System.out.println(max);
    }
}
