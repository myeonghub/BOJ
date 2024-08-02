import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n] ;
        int [][] dp = new int[41][2] ;

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i = 0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            for(int j =2; j<=arr[i];j++){
                dp[j][0] = dp[j-1][0] + dp[j-2][0];
                dp[j][1] = dp[j-1][1] + dp[j-2][1];
            }
            System.out.println(dp[arr[i]][0] + " " + dp[arr[i]][1]);
        }


    }
}
