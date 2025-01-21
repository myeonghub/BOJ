import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        int[] arr = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(dp(arr,n));
    }

    static long dp(int[] arr , int n) {

        long[] dp = new long[n+1];

        dp[1] = arr[1];

        if(n>=2){
            dp[2] = arr[2] + arr[1];
        }

        for(int i=3;i<=n;i++){
            dp[i] = Math.max(arr[i-1]+dp[i-3], dp[i-2])+arr[i];
        }

        return dp[n];
    }
}
