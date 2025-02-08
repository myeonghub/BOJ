import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());


        int[][] arr= new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st1.nextToken());
            arr[i][1] = Integer.parseInt(st1.nextToken());
        }

        int[]dp = new int[c+100];
        Arrays.fill(dp,999999999);
        dp[0] = 0;

        for(int i=0;i<n;i++) {
            for(int j=arr[i][1];j<c+100;j++) {
                if (j - arr[i][1] >= 0) {
                    dp[j] = Math.min(dp[j], (dp[j - arr[i][1]]) + arr[i][0]);
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=c;i<c+100;i++){
            result = Math.min(dp[i],result);
        }

        System.out.println(result);
    }
}
