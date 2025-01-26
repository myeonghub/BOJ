import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][][] dp = new int[n][n][3];

        dp[0][1][0] = 1;

        for(int i=0;i<n;i++){
            for(int j=2;j<n;j++){
                if(j - 1 >= 0 && arr[i][j] == 0) {
                    dp[i][j][0] = dp[i][j-1][0] + dp[i][j-1][2];
                }
                if(i - 1 >= 0 && arr[i][j] == 0) {  
                    dp[i][j][1] = dp[i-1][j][1] + dp[i-1][j][2];
                }
                if(i-1 >= 0 && j-1 >= 0 && arr[i][j] == 0 && arr[i-1][j] == 0 && arr[i][j-1] == 0) {
                    dp[i][j][2] = dp[i-1][j-1][0] + dp[i-1][j-1][1] + dp[i-1][j-1][2];
                }
            }
        }

        int ans = dp[n-1][n-1][0] + dp[n-1][n-1][1] + dp[n-1][n-1][2];
        System.out.println(ans);
    }
}
